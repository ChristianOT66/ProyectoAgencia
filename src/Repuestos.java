public class Repuestos {

    protected String rMotor;
    protected String rPuerta;
    protected String rInterior;
    protected String rLuces;

    public Repuestos() {
        this.rInterior = "";
        this.rPuerta = "";
        this.rInterior = "";
        this.rLuces = "";
    }

    public String getrMotor() {
        return rMotor;
    }

    public void setrMotor(String rMotor) {
        this.rMotor = rMotor;
    }

    public String getrPuerta() {
        return rPuerta;
    }

    public void setrPuerta(String rPuerta) {
        this.rPuerta = rPuerta;
    }

    public String getrInterior() {
        return rInterior;
    }

    public void setrInterior(String rInterior) {
        this.rInterior = rInterior;
    }

    public String getrLuces() {
        return rLuces;
    }

    public void setrLuces(String rLuces) {
        this.rLuces = rLuces;
    }
}
