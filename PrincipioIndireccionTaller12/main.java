package PrincipioIndireccionTaller12;

public class main {
    public static void main(String[] args) {
        IServicioCorreo gmail = new ServicioGmail();
        IServicioCorreo outlook = new ServivioOutlook();
        Usuario usuario = new Usuario("Juan", "1234");
        Usuario usuario2 = new Usuario("Pedro", "5678");
        Correo correogm = (Gmail) gmail.enviarCorreo(usuario);
        Correo correoout = (Outlook) outlook.enviarCorreo(usuario2);
        System.out.println(correogm.getUsuario().getNombre() + ", ID: " + correogm.getUsuario().getIdentificacion());
        System.out.println(correoout.getUsuario().getNombre() + ", ID: " + correoout.getUsuario().getIdentificacion());

        
    }
}