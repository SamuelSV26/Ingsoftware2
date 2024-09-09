package tallerDIP2;

public class EnviarGmailImpl extends EmailGmail implements IServicioEmail {

    public EnviarGmailImpl(String to, String subject, String body, String image) {
        super(to, subject, body, image);
    }

    @Override
    public void enviarEmail() {
        System.out.println("Enviando Gmail a: " + getAsunto());
        System.out.println("Con asunto: " + getCuerpo());
        System.out.println("Con cuerpo: " + getDestinatario());
        System.out.println("Con imagen: " + getImage());
    }
}
