package tallerLSP;

abstract class producto {
    String nombre;
    double precio;
    int cantidad;

    abstract double calcularPrecio();

    public producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

}
