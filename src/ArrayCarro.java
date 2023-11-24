public class ArrayCarro {
   private String matricula;
   private String modelo;
   private String kilometraje;
   private String precio;
   
   
   public ArrayCarro(){
       this.matricula="";
       this.modelo="";
       this.kilometraje="";
       this.precio="";
   }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String Matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
}
