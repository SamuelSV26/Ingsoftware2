package tallerDIP2;

public class main {
    public static void main(String[] args) {
        IServicioEmail servicioEmail = new EnviarGmailImpl("Samuel", "Carta", "Hola", "image");
        IServicioEmail servicioEmail1 = new EnviarYahooImpl("Samuel", "Carta", "Hola", "file");
        IServicioEmail servicioEmail2 = new EnviarOutlookImpl("Samuel", "Carta", "Hola");

        Sistema enviarMensaje = new Sistema(servicioEmail);
        enviarMensaje.enviarMensaje();
        System.out.println("");
        enviarMensaje = new Sistema(servicioEmail1);
        enviarMensaje.enviarMensaje();
        System.out.println("");
        enviarMensaje = new Sistema(servicioEmail2);
        enviarMensaje.enviarMensaje();
    }
}
