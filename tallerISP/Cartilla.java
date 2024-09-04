package tallerISP;

public class Cartilla implements LibreriaCartilla {
    private String nombre;
    private String genero;
    private int id;

    @Override
    public void prestamo(){
        System.out.println("Prestamo de cartilla");
    }
    public void devolucion(){
        System.out.println("Devolucion de cartilla");
    }
    public void mantenimiento(){
        System.out.println("Mantenimiento de cartilla");
    }
}
