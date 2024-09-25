package tallerOCP8;

public class DescuentoTemporal implements CalcularDescuento {
    private double descuento, precio;

    public DescuentoTemporal(double descuento, double precio) {
        this.descuento = descuento;
        this.precio = precio;
    }

    @Override
    public double getDescuento() {
        return (precio - descuento);
    }


}
