package PrincipioIndireccionTaller12;

public class Usuario {
    private String nombre;  
    private String identificacion;

    public Usuario(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
