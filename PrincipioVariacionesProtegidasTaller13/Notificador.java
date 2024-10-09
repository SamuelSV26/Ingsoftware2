package PrincipioVariacionesProtegidasTaller13;

public class Notificador {
    private CanalNotificacion canal;

    public Notificador(CanalNotificacion canal) {
        this.canal = canal;
    }

    public void enviarNotificacion(Notificacion notificacion) {
        canal.enviarNoti(notificacion);
    }
    
}
