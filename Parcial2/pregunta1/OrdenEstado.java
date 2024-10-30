package pregunta1;

public class OrdenEstado {

    public void obtenerEstado(int ordenId) {
        if (ordenId < 0) {
            System.out.println("Orden no valida");
        } else if (ordenId > 100) {
            System.out.println("Orden Completada");
        } else if (ordenId > 50) {
            System.out.println("En proceso");
        } else {
            System.out.println("Pendiente");
        }
    }
}