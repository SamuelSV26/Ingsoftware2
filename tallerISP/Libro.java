package tallerISP;

public class Libro implements LibreriaLibro {
    private String nombre;
    private String genero;
    private int id;

    @Override
    public void prestamo(){
        System.out.println("Prestamo de libro");
    }
    public void devolucion(){
        System.out.println("Devolucion de libro");
    }
    public void portada(){
        System.out.println("Portada de libro");
    }
    public void mantenimiento(){
        System.out.println("Mantenimiento de libro");
    }
}
