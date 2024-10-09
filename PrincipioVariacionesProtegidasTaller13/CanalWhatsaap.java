package PrincipioVariacionesProtegidasTaller13;

public class CanalWhatsaap implements CanalNotificacion {
    @Override
    public void enviarNoti(Notificacion notificacion) {
        System.out.println("Enviando por Whatsapp");
        System.out.println("Titulo: " + notificacion.getTitulo());
        System.out.println("Mensaje: " + notificacion.getMensaje());
    }
    
}
