package PrincipioCreadorTaller10;

public class main {
    public static void main(String[] args) {
        Orden orden = new Orden();
        orden.agregarComputadora("Intel i7", "Nvidia RTX 3080", "32GB");
        orden.agregarComputadora("AMD Ryzen 5", "Nvidia RTX 3060", "16GB");
        orden.getOrden();
    }
}
