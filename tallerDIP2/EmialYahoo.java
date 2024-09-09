package tallerDIP2;

public class EmialYahoo  extends Email{
    public String files;

    public EmialYahoo(String to, String subject, String body, String files) {
        super(to, subject, body);
        this.files = files;
    }

    public String getFiles() {
        return files;
    }
}
