package tallerOCP8;

public class main {
    public static void main(String[] args) {
        DescuentoPorcentaje descuentoPorcentaje = new DescuentoPorcentaje(10, 100,20);
        DescuentoTemporal descuentoTemporal = new DescuentoTemporal(10, 100);
        DescuentoFijo descuentoFijo = new DescuentoFijo(10, 100);

        System.out.println("Descuento porcentaje: " + descuentoPorcentaje.getDescuento());
        System.out.println("Descuento temporal: " + descuentoTemporal.getDescuento());
        System.out.println("Descuento fijo: " + descuentoFijo.getDescuento());
    }
}
