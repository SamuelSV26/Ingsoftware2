package tallerOCP8;

public class DescuentoFijo implements CalcularDescuento {
    private double descuento;
    private double precio;

    public DescuentoFijo(double descuento, double precio) {
        this.descuento = descuento;
        this.precio = precio;
    }

    @Override
    public double getDescuento() {
        return precio - descuento;
    }
}
