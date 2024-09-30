package PrincipioControladorTaller10;

public class Usuario {
    private ControladorEntrada controlar;

    public Usuario(ControladorEntrada controlar) {
        this.controlar = controlar;
    }

    public void comprarEntrada(TipoEntrada tipo) {
        controlar.comprarEntrada(tipo);
    }
}
