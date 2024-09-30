package PrincipioExpertoTaller10;

public class main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        Libro libro1 = new Libro("El Quijote", "Cervantes", "123456", 10, 1);
        Libro libro2 = new Libro("El Señor de los Anillos", "Tolkien", "654321", 20, 2);
        carrito.agregarLibro(libro1);
        carrito.agregarLibro(libro2);
        System.out.println("Precio total: " + carrito.calcularPrecioTotal());
    }
}
