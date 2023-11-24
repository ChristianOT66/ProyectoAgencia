import javax.swing.JOptionPane;
public class Valorenos implements InterfazValorenos {

    private String opinion;
    private String consejo;
    private int puntaje;

    public Valorenos() {
        this.opinion = "";
        this.consejo = "";
        this.puntaje = 0;
    }

    @Override
    public String getOpinion() {
        return opinion;
    }

    @Override
    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    @Override
    public String getConsejo() {
        return consejo;
    }

    @Override
    public void setConsejo(String consejo) {
        this.consejo = consejo;
    }

    @Override
    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public void pedirDatos() {
        Valorenos d = new Valorenos();

        d.setOpinion(JOptionPane.showInputDialog(null, "¿Que opina sobre nuestra agencia?","VALORENOS",JOptionPane.INFORMATION_MESSAGE));
        d.setConsejo(JOptionPane.showInputDialog(null, "¿Que consejo nos daría para implementar en el futuro?","VALORENOS",JOptionPane.INFORMATION_MESSAGE));
        d.setPuntaje(Integer.parseInt(JOptionPane.showInputDialog(null, "Del 1 al 10 ¿Que puntaje le daría a nuetra agencia?","VALORENOS",JOptionPane.INFORMATION_MESSAGE)));

        JOptionPane.showMessageDialog(null, "Muchas gracias por sus respuestas, su opinion será tomada para la mejora del sistema a futuro\nSus respuestas fueron: \n\nOpinion: " + d.getOpinion() + "\nConsejo: " + d.getConsejo()
                + "\nPuntaje: " + d.getPuntaje(),"***GRACIAS POR SUS COMENTARIOS***",JOptionPane.INFORMATION_MESSAGE);
    }
}