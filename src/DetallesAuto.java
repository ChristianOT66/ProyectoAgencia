import javax.swing.JOptionPane;
public class DetallesAuto extends Auto{

    @Override
    public String getTipoCombustuble() {
        return tipoCombustuble;
    }

    @Override
    public void setTipoCombustuble(String tipoCombustuble) {
        this.tipoCombustuble = tipoCombustuble;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getTipoSuspension() {
        return tipoSuspension;
    }

    @Override
    public void setTipoSuspension(String tipoSuspension) {
        this.tipoSuspension = tipoSuspension;
    }

    @Override
    public int getCantPuertas() {
        return cantPuertas;
    }

    @Override
    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
    public void pedirDatos() {
        DetallesAuto d = new DetallesAuto();
        
        d.setCantPuertas(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de puertas:","Caracteristicas sobre su coche",JOptionPane.INFORMATION_MESSAGE)));
        d.setColor(JOptionPane.showInputDialog(null, "Digite el color que desea el auto:","Caracteristicas sobre su coche",JOptionPane.INFORMATION_MESSAGE));
        d.setTipoCombustuble(JOptionPane.showInputDialog(null, "Digite el tipo de combustible:","Caracteristicas sobre su coche",JOptionPane.INFORMATION_MESSAGE));
        d.setTipoSuspension(JOptionPane.showInputDialog(null, "Digite el tipo de suspensión:","Caracteristicas sobre su coche",JOptionPane.INFORMATION_MESSAGE));
        
        JOptionPane.showMessageDialog(null, "Verifique las caracteristicas del coche antes de la compra:\n\nCantidad de"
                + " puertas: "+d.getCantPuertas()+"\nColor: "+d.getColor()+"\nTipo de suspensión: "+d.getTipoSuspension()+
                "\nTipo de Combustible: "+d.getTipoCombustuble(),"***CARACTERISTICAS DEL COCHE***",JOptionPane.INFORMATION_MESSAGE);
        new DatosTarjeta().setVisible(true);        
}}