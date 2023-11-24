
public class ContactenosClase {

    private String correo;
    private String telefono;
    private String asunto;
    private String mensaje;

    public ContactenosClase() {
        this.correo = "";
        this.telefono = "";
        this.asunto = "";
        this.mensaje = "";

    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
