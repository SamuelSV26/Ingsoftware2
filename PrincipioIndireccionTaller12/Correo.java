package PrincipioIndireccionTaller12;

public class Correo {
    private String cuerpo;
    private String asunto;
    private Usuario usuario;

    public String getCuerpo() {
        return cuerpo;
    }
    public String getAsunto() {
        return asunto;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}