package tienda;

public class calculoImpuestoIva extends calculo {

    public calculoImpuestoIva(String producto, int cantidad, double precio){
        super(producto, cantidad, precio);
    }

    @Override
    public double calcular() {
        return precio * 0.19;
    }
}
