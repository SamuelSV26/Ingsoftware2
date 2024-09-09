package tallerDIP2;

public class Sistema {
     private IServicioEmail servicioEmail;

    public Sistema(IServicioEmail servicioEmail) {
        this.servicioEmail = servicioEmail;
    }

    public void enviarMensaje() {
        servicioEmail.enviarEmail();
    }

}
