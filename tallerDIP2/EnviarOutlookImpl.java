package tallerDIP2;

public class EnviarOutlookImpl extends EmailOutlook implements IServicioEmail {
    public EnviarOutlookImpl(String to, String subject, String body) {
        super(to, subject, body);
    }
    
    @Override
    public void enviarEmail() {
        System.out.println("Enviando Outlook a: " + getAsunto());
        System.out.println("Con asunto: " + getCuerpo());
        System.out.println("Con cuerpo: " + getDestinatario());
    }
    
}
