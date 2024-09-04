package tallerISP2;

public class PaqueteGrande extends Paquete implements IPaqueteGrande {
    private String medioTransporte;
    private int volumen;

    public PaqueteGrande(int peso, int dimensiones, int volumen, String medioTransporte) {
        super(peso, dimensiones);
        this.volumen = volumen;
        this.medioTransporte = medioTransporte;
    }
    @Override
    public void calcularCostoEnvioGrande() {
        System.out.println("El costo de envio de un paquete grande es de: " + (volumen * 0.5));
    }
    @Override
    public void entrega() {
        System.out.println("El paquete grande se entregó en el medio de transporte: " + medioTransporte);
    }
}
