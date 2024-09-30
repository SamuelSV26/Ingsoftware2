package PrincipioCreadorTaller10;

public class FabricarPC {
    public Computadora crearComputadora(String procesador, String tarjetaGrafica, String ram) {
        return new Computadora(procesador, tarjetaGrafica, ram);
    } 
}
