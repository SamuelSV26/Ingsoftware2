package PrincipioVariacionesProtegidasTaller13;

public class main {
    public static void main(String[] args) {
        CanalNotificacion canalC = new CanalCorreo();
        CanalNotificacion canalS = new CanalSMS();
        CanalNotificacion canalW = new CanalWhatsaap();

        Notificador notificadorC = new Notificador(canalC);
        Notificador notificadorS = new Notificador(canalS);
        Notificador notificadorW = new Notificador(canalW);

        Notificacion notificacion = new Notificacion("Nueva notificacion", "Hola");
        notificadorC.enviarNotificacion(notificacion);
        System.err.println("");
        notificadorS.enviarNotificacion(notificacion);
        System.err.println("");
        notificadorW.enviarNotificacion(notificacion);

    }
    
}
