package pregunta1;

public class Main {
    public static void main(String[] args) {
        IfabricaEnvios fabricaE = new fabricaEnvios();
        IenvioExpress express = fabricaE.envioExpress();
        IenvioRegular regular = fabricaE.envioRegular();
        regular.enviar();
        express.enviar();
    }
}
