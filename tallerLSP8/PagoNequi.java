package tallerLSP8;

public class PagoNequi extends Pago {
    private String numeroTelefono;

    public PagoNequi(String numeroTelefono , double monto) {
        super(monto);
        this.numeroTelefono = numeroTelefono;
    }
    
    @Override
    public void realizarPago() {
        System.out.println("Pago con Nequi");
    }
}
