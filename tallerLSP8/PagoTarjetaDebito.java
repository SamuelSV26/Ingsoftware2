package tallerLSP8;

public class PagoTarjetaDebito extends Pago {
    private String cuatroDigitos;

    public PagoTarjetaDebito(String cuatroDigitos, double monto) {
        super(monto);
        this.cuatroDigitos = cuatroDigitos;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago con tarjeta de débito");
    }
}
