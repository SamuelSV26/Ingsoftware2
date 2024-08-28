package tienda;

public class calculoImpuestoSaludable extends calculo {

    public calculoImpuestoSaludable(String producto, int cantidad, double precio) {
        super(producto, cantidad, precio);
    }

    @Override
    public double calcular() {
        return precio * 0.05;
    }

}
