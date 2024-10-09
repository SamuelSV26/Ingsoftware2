package PrincipioIndireccionTaller12;

public class ServivioOutlook implements IServicioCorreo {
    @Override
    public Correo enviarCorreo(Usuario usuario) {
        Outlook outlook = new Outlook();
        outlook.setUsuario(usuario);
        return outlook;
    }  
    
}
