package tallerDIP2;

public class EnviarYahooImpl extends EmialYahoo implements IServicioEmail{
    public EnviarYahooImpl(String to, String subject, String body, String files) {
        super(to, subject, body, files);
    }
    @Override
    public void enviarEmail() {
        System.out.println("Enviando Yahoo a: " + getAsunto());
        System.out.println("Con asunto: " + getCuerpo());
        System.out.println("Con cuerpo: " + getDestinatario());
        System.out.println("Con archivos: " + getFiles());
    }
    
}
