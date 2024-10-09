package PrincipioVariacionesProtegidasTaller13;

public class Notificacion {
    private String titulo;
    private String mensaje;

    public Notificacion(String titulo, String mensaje) {
        this.titulo = titulo;
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
