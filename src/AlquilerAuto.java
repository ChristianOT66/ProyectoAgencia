
public class AlquilerAuto {

    protected String nombre1;
    protected int valor1;
    protected String nombre2;
    protected int valor2;
    protected String nombre3;
    protected int valor3;
    protected int resultado;

    public AlquilerAuto() {
        this.nombre1 = "";
        this.valor1 = 0;
        this.nombre2 = "";
        this.valor2 = 0;
        this.nombre3 = "";
        this.valor3 = 0;
        this.resultado = 0;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public String getNombre3() {
        return nombre3;
    }

    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public int getValor3() {
        return valor3;
    }

    public void setValor3(int valor3) {
        this.valor3 = valor3;
    }

    public int calcularPrecio() {
        resultado = valor1 + valor2 + valor3;
        return resultado;
    }
}
