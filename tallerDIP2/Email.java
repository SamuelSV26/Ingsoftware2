package tallerDIP2;

public abstract class Email {
    private String to;
    private String subject;
    private String body;

    public Email(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    public String getAsunto() {
        return to;
    }

    public String getCuerpo() {
        return subject;
    }

    public String getDestinatario() {
        return body;
    }
}
