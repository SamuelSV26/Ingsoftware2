package PrincipioIndireccionTaller12;

public class ServicioGmail implements IServicioCorreo{

    @Override
    public Correo enviarCorreo(Usuario usuario) {
        Gmail gmail = new Gmail();
        gmail.setUsuario(usuario);
        return gmail;
    }    
}
