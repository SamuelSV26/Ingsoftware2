package PrincipioVariacionesProtegidasTaller13;

public class CanalCorreo implements CanalNotificacion {
    @Override
    public void enviarNoti(Notificacion notificacion) {
        System.out.println("Enviando correo");
        System.out.println("Titulo: " + notificacion.getTitulo());
        System.out.println("Mensaje: " + notificacion.getMensaje());
    }
}