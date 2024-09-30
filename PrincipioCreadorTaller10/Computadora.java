package PrincipioCreadorTaller10;

public class Computadora {
    private String Procesador;
    private String tarjetaGrafica;
    private String ram;


    public Computadora(String procesador, String tarjetaGrafica, String ram) {
        Procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.ram = ram;
    }

    public String getProcesador() {
        return Procesador;
    }
    public String getRam() {
        return ram;
    }
    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }
}
