package PrincipioControladorTaller10;

public class main {
    public static void main(String[] args) {
        ControladorEntrada controlador = new ControladorEntrada();
        controlador.agregarEntrada(TipoEntrada.VIP, 100, true);
        controlador.agregarEntrada(TipoEntrada.GENERAL, 50, true);
        controlador.agregarEntrada(TipoEntrada.PREFERENCIAL, 75, true);

        Usuario usuario = new Usuario(controlador);
        usuario.comprarEntrada(TipoEntrada.VIP);
        usuario.comprarEntrada(TipoEntrada.VIP);
        usuario.comprarEntrada(TipoEntrada.GENERAL);
        usuario.comprarEntrada(TipoEntrada.PREFERENCIAL);
        
    }  }
