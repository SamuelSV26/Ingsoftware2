package tallerOCP8;

public class DescuentoPorcentaje implements CalcularDescuento {
    private double descuento;
    private double precio;
    private double porcentaje;

    public DescuentoPorcentaje(double descuento, double precio, double porcentaje) {
        this.descuento = descuento;
        this.precio = precio;
        this.porcentaje = porcentaje;
    }

    @Override
    public double getDescuento() {
        return (precio * descuento) / porcentaje;
    }
}
