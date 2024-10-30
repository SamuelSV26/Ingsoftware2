package pregunta1;
// Libro libro = new Libro("Hola", "Jose", 150, "2001");
public class main {
    public static void main(String[] args) {
        Orden orden = new Orden();
        OrdenEstado ordenE = new OrdenEstado();




        ordenE.obtenerEstado(1);
        orden.calcularTotal(150, 1);
        orden.calcularTotal(150, 0);


    }
}
