package tallerLSP8;

public abstract class Pago {
    private double monto;
    public abstract void realizarPago();

    public Pago(double monto) {
        this.monto = monto;
    }
}
