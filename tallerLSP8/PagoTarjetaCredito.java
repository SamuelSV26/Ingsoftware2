package tallerLSP8;

public class PagoTarjetaCredito extends Pago {
    private String numeroTarjeta;
    private String fechaExpiracion;
    private String cvv;

    public PagoTarjetaCredito(String numeroTarjeta, String fechaExpiracion, String cvv, double monto) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.cvv = cvv;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago con tarjeta de crédito");
    }
    
}
