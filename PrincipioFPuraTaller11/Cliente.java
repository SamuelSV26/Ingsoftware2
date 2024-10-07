package PrincipioFPuraTaller11;

public class Cliente {    
    private String nombre;
    private String direccion;
    
    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}