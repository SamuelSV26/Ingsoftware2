package tallerISP2;

public class main {
    public static void main(String[] args) {
        PaquetePequeño paquetePequeño = new PaquetePequeño( 15, 2, 300);
        PaqueteGrande paqueteGrande = new PaqueteGrande( 15, 2, 20, "Camion");
        PaquetePeligroso paquetePeligroso = new PaquetePeligroso( 15, 2, "Explosivo", true);

        paquetePequeño.calcularCostoEnvioPequeño();
        paqueteGrande.calcularCostoEnvioGrande();
        paquetePeligroso.asegurarPaquetePeligroso();
        paquetePeligroso.verificarContenidoPeligroso();
        
    }
}