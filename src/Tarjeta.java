public class Tarjeta {
    private String identificacion;
    private String nombre;
    private int numTarjeta;
    private String tipoTarjeta;
    private String direcc;
    private int codSeguridad;
    private String genero; 
    
    public Tarjeta(){
        this.identificacion="";
        this.nombre="";
        this.numTarjeta=0;
        this.tipoTarjeta="";
        this.direcc="";
        this.codSeguridad=0;
        this.genero="";
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    public int getCodSeguridad() {
        return codSeguridad;
    }

    public void setCodSeguridad(int codSeguridad) {
        this.codSeguridad = codSeguridad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}