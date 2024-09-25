// Se hace en el mismo archivo para entregar el taller en una solo archivo
public class TallerDRY9{
    public static void main(String[] args) {
        String email = "Samuel@gmail.com";
        String email2 = "Samuelgmail.com";
        // Llamado a la función
        validarEmail(email);
        validarEmail(email2);
    }
    // Solución
    static void validarEmail(String email) {
        if (!email.contains("@") || !email.contains(".")) {
        System.out.println("Email invalido");
        }else{
            System.out.println("Email valido");
        }
    }
}