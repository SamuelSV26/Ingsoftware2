package PrincipioVariacionesProtegidasTaller13;

public class CanalSMS implements CanalNotificacion {
    @Override
    public void enviarNoti(Notificacion notificacion) {
        System.out.println("Enviando SMS");
        System.out.println("Titulo: " + notificacion.getTitulo());
        System.out.println("Mensaje: " + notificacion.getMensaje());
    }
    
}
