package PatronBuilderTaller16;

import java.util.HashSet;
import java.util.Set;

public static class UsuarioBuilder{
    private String nombre;
    private int edad;
    private String correo;
    private Set<String> intereses = new HashSet<>();

    public UsuarioBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public UsuarioBuilder setCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public UsuarioBuilder addInteres(String interes) {
        this.intereses.add(interes);
        return this;
    }

    public Usuario build() {
        return new Usuario(this);
    }
}


