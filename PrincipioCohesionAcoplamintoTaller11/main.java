package PrincipioCohesionAcoplamintoTaller11;

public class main{
    public static void main(String[] args) {
        Producto producto1 = new Producto("Cargador", 150, "Cargador de celular");
        Producto producto2= new Producto("Celular", 15000, "Celular");
        
        Carro carrito = new Carro();
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.mostrarProductos();

        System.out.println("Precio total: " + carrito.PrecioTotal());
    }
}
