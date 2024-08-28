package tienda;
            
abstract class calculo {
    String producto;
    int cantidad;
    double precio;

    abstract double calcular(); 

    public calculo(String producto, int cantidad, double precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
}
