import java.util.Scanner;

class Usuario{

    private String nombre = "julio";
    private String email = "julio.email";
    private String contraseña = "1234";
    private Integer sueldoHora = 4833;

    public String getNombre() {
        return nombre;
    }
    public String getContraseña() {
        return contraseña;
    }
    public String getEmail() {
        return email;
    }
    public Integer getSueldoHora() {
        return sueldoHora;
    }

}

class UsuarioConsulta{
    public void consultarUsuario(Usuario usuario) {
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Sueldo por hora: " + usuario.getSueldoHora());
    }
}

class SalarioCalcular{
    public void calcularSalario(Usuario usuario, int horasTrabajadas) {
        int salario = usuario.getSueldoHora() * horasTrabajadas;
        System.out.println("El salario calculado al mes es de: " + salario);
    }

}
class EnviarCorreo{
    public void enviarCorreo(Usuario usuario, String mensaje) {
        System.out.println("Enviando correo a " + usuario.getEmail() + "...");
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Correo enviado con éxito.");
    }
}

class ValidarContraseña{
    public void validar(Usuario usuario, String contraseña) {
        if (contraseña.equals(usuario.getContraseña())) {
            System.out.println("Contraseña correcta");
        }else{
            System.out.println("Contraseña incorrecta");
        }
    }
}

class Main {public static void main(String[] args) {
    Usuario usuario = new Usuario();
    UsuarioConsulta consulta = new UsuarioConsulta();
    SalarioCalcular salarioCalcular = new SalarioCalcular();
    EnviarCorreo enviarCorreo = new EnviarCorreo();
    ValidarContraseña validarContraseña = new ValidarContraseña();

    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
        System.out.println("\nMenú:");
        System.out.println("1. Consultar Información del Usuario");
        System.out.println("2. Calcular Salario");
        System.out.println("3. Enviar Correo");
        System.out.println("4. Validar Contraseña");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                consulta.consultarUsuario(usuario);
                break;
            case 2:
                System.out.print("Ingrese el número de horas trabajadas: ");
                int horasTrabajadas = scanner.nextInt();
                salarioCalcular.calcularSalario(usuario, horasTrabajadas);
                break;
            case 3:
                System.out.print("Ingrese el mensaje a enviar: ");
                scanner.nextLine();
                String mensaje = scanner.nextLine();
                enviarCorreo.enviarCorreo(usuario, mensaje);
                break;
            case 4:
            System.out.print("Ingrese la contraseña a validar: ");
            String contraseña = scanner.next();
            validarContraseña.validar(usuario, contraseña);
            break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    } while (opcion != 5);

    scanner.close();
}
}