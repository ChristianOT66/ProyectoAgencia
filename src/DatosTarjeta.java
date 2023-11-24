
import java.awt.*;
import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DatosTarjeta extends javax.swing.JFrame {

    private String identificacion;
    private String nombre;
    private String numTarjeta;
    private String tipoTarjeta;
    private String direcc;
    private String codSeguridad;
    private char genero;

    public DatosTarjeta() {
        initComponents();
        setTitle("Digite los datos de su tarjeta de credito");
        this.getContentPane().setBackground(Color.DARK_GRAY);
        setLocationRelativeTo(null);
        setResizable(false);
        jTextField1.requestFocus();
        setTitle("Datos de la tarjeta");
        jButton1.setEnabled(false);

    }

    public void agregar() {
        try {
            if ((jTextField1.getText().equals("")) || (jTextArea1.getText().equals(""))
                    || (jFormattedTextField1.getText().equals(""))
                    || (jTextField2.getText().equals("")) || (jFormattedTextField1.getText().equals(""))
                    || (jFormattedTextField2.getText().equals(""))) {

                JOptionPane.showMessageDialog(null, "Eror, no se han llenado todos los espacios!",
                        "Campos en blanco", JOptionPane.ERROR_MESSAGE);
            } else {
                Tarjeta t = new Tarjeta();
                t.setIdentificacion(jTextField1.getText());
                t.setNombre(jTextField2.getText());
                t.setNumTarjeta(Integer.parseInt(
                        String.valueOf(jFormattedTextField2.getText())));
                t.setTipoTarjeta(jFormattedTextField1.getText());
                t.setDirecc(jTextArea1.getText());
                t.setCodSeguridad(Integer.parseInt(
                        String.valueOf(jFormattedTextField2.getText())));
                t.setGenero(jTextArea1.getText());
                if (jRadioButton1.isSelected()) {
                    t.setGenero("Masculino");
                } else if (jRadioButton2.isSelected()) {
                    t.setGenero("Femenino");

                }

                DataOutputStream dt = new DataOutputStream(new FileOutputStream("tarjeta.dat", true));
                dt.writeUTF(t.getIdentificacion());
                dt.writeInt(t.getNumTarjeta());
                dt.writeUTF(t.getTipoTarjeta());
                dt.writeUTF(t.getDirecc());
                dt.writeInt(t.getCodSeguridad());
                dt.writeUTF(t.getGenero());
                JOptionPane.showMessageDialog(null,
                        "Compra realizada correctamente!", "***GRACIAS POR SU PREFERENCIA***", JOptionPane.INFORMATION_MESSAGE);
                limpiarTextos();
                dt.close();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocurrió un error!" + "\n\n" + ex.getMessage());
        }
    }
    public void consultar() {
        String id, nom, tipoTar, direc, genero;
        int numTarjeta, codSeguridad;
        boolean encontrado = false;
        try {
            DataInputStream dt2 = new DataInputStream(new FileInputStream("tarjeta.dat"));
            try {
                while (true) {
                    id = dt2.readUTF();
                    numTarjeta = dt2.readInt();
                    nom = dt2.readUTF();
                    tipoTar = dt2.readUTF();
                    direc = dt2.readUTF();
                    codSeguridad = dt2.readInt();
                    genero = dt2.readUTF();

                    if (id.equals(jTextField1.getText())) {
                        encontrado = true;

                        jTextField2.setText(nom);
                        jFormattedTextField1.setText(String.valueOf(numTarjeta));
                        jTextArea1.setText(direc);
                        jFormattedTextField2.setText(String.valueOf(codSeguridad));

                        if (genero.equals("Masculino")) {
                            jRadioButton1.setSelected(true);
                        } else if (genero.equals("Femenino")) {
                            jRadioButton2.setSelected(true);
                        }

                        if (tipoTar.equals("Visa")) {
                            jComboBox1.setSelectedIndex(0);
                        } else if (tipoTar.equals("MasterCard")) {
                            jComboBox1.setSelectedIndex(1);
                        } else if (tipoTar.equals("AmericanExpress")) {
                            jComboBox1.setSelectedIndex(2);
                        } else if (tipoTar.equals("Maestro")) {
                            jComboBox1.setSelectedIndex(3);
                        }
                    }
                }
            } catch (EOFException ex) {
                if (encontrado == false) {
                    JOptionPane.showMessageDialog(null, "No se encontraron los datos buscados!", "No encontrado", JOptionPane.ERROR_MESSAGE);
                }
                dt2.close();
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Datos no existen");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar");
        }
    }
    
    public void limpiarTextos() {
        jTextField1.setText("");
        jTextField2.setText("");
        jFormattedTextField1.setText("");
        jComboBox1.setSelectedIndex(0);
        jTextArea1.setText("");
        jFormattedTextField2.setText("");
        jRadioButton1.setSelected(false);
        jTextField1.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        chbTermino = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Identificacion");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Completo");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero de Tarjeta");

        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visa", "MasterCard", "AmericanExpress", "Maestro", " " }));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo de tarjeta");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dirección Exacta");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jRadioButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("M");

        jRadioButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("F");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Genero");

        chbTermino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chbTermino.setForeground(new java.awt.Color(255, 255, 255));
        chbTermino.setText("Acepto los terminos y condiciones");
        chbTermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbTerminoActionPerformed(evt);
            }
        });
        chbTermino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chbTerminoKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Comprar Vehiculo");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Codigo de seguridad");

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("<html>Al aceptar los terminos y condiciones usted autoriza a nuestro sistema a<p>guardar sus datos para su uso futuro<html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jRadioButton1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jRadioButton2))
                                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField1)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(chbTermino)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel6))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chbTermino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chbTerminoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chbTerminoKeyPressed

    }//GEN-LAST:event_chbTerminoKeyPressed

    private void chbTerminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbTerminoActionPerformed
        if (chbTermino.isSelected()) {
            jButton1.setEnabled(true);
        } else {
            jButton1.setEnabled(false);
        }

    }//GEN-LAST:event_chbTerminoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosTarjeta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chbTermino;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
