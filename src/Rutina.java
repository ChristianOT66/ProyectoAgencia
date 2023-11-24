import javax.swing.JOptionPane;

public class Rutina extends Repuestos{
    public void pedirRepuestos(){
        Repuestos r=new Repuestos();
        r.setrMotor(JOptionPane.showInputDialog(null,"Digite el repuesto a solicitar para el motor","Pida su repuesto en linea",JOptionPane.INFORMATION_MESSAGE));
        r.setrPuerta(JOptionPane.showInputDialog(null,"Digite el repuesto a solicitar para la o las puertas","Pida su repuesto en linea",JOptionPane.INFORMATION_MESSAGE));
        r.setrInterior(JOptionPane.showInputDialog(null,"Digite el repuesto a solicitar para el interior del vehiculo","Pida su repuesto en linea",JOptionPane.INFORMATION_MESSAGE));
        r.setrLuces(JOptionPane.showInputDialog(null,"Digite el repuesto a solicitar en luces","Pida su repuesto en linea",JOptionPane.INFORMATION_MESSAGE));
        
        JOptionPane.showMessageDialog(null, "Su solicitud será tramitada en seguida, puede recoger sus repuestos en nuestra agencia:\nMotor: "+r.getrMotor()+
                "\nPuerta: "+r.getrPuerta()+"\n"+r.getrInterior()+"\nLuces: "+r.rLuces,"Usted a solicitado repuestos en:",JOptionPane.INFORMATION_MESSAGE);
    }   
    
    public void llenarAlquiler(){
        OperacionPoli op=new OperacionPoli();
        op.setNombre1(JOptionPane.showInputDialog(null,"Digite el nombre de la primera pieza que alquilará:","Llene lo solicitado",JOptionPane.INFORMATION_MESSAGE));
        op.setValor1(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el monto que abonará a este articulo:","Llene lo solicitado",JOptionPane.INFORMATION_MESSAGE)));
        op.setNombre2(JOptionPane.showInputDialog(null,"Digite el nombre de la segunda pieza que alquilará:","Llene lo solicitado",JOptionPane.INFORMATION_MESSAGE));
        op.setValor2(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el monto que abonará a este articulo:","Llene lo solicitado",JOptionPane.INFORMATION_MESSAGE)));
        op.setNombre3(JOptionPane.showInputDialog(null,"Digite el nombre de la tercera pieza que alquilará:","Llene lo solicitado",JOptionPane.INFORMATION_MESSAGE));
        op.setValor3(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el monto que abonará a este articulo:","Llene lo solicitado",JOptionPane.INFORMATION_MESSAGE)));
        
        JOptionPane.showMessageDialog(null, "Los productos alquilados fueron: "+op.getNombre1()+", "+op.getNombre2()
                +", "+op.getNombre3()+"\nPor un valor total de: "+op.calcularPrecio(),"***Productos Alquilados con exito***",JOptionPane.INFORMATION_MESSAGE);
    }
}
