package tallerISP;

public class DVD implements LibreriaDVD {
    private String nombre;
    private String archivo;
    private int cantidad;

    @Override
    public void prestamo(){
        System.out.println("Prestamo de DVD");
    }
    public void devolucion(){
        System.out.println("Devolucion de DVD");
    }
}
