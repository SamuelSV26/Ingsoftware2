package tallerISP;

public class main {
    public static void main(String[] args) {
        Cartilla cartilla = new Cartilla();
        Libro libro = new Libro();
        DVD dvd = new DVD();

        cartilla.prestamo();
        cartilla.devolucion();
        cartilla.mantenimiento();

        libro.prestamo();
        libro.devolucion();
        libro.portada();
        libro.mantenimiento();


        dvd.prestamo();
        dvd.devolucion();
    }
}
