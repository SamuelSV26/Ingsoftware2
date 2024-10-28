package PatronPrototypeTaller16;

public class main {
    public static void main(String[] args) {
        Producto producto = new Producto("Carne", 100, "Frescos");
        Producto productoClonado = (Producto) producto.clone();
    
        System.out.println(producto);
        System.out.println(productoClonado);

        System.out.println("¿Mismo objeto? " + (producto == productoClonado));
    }
}
