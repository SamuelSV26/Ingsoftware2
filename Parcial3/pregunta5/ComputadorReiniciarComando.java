package pregunta5;

public class ComputadorReiniciarComando implements Comando {
    private Computador computador;

    public ComputadorReiniciarComando(Computador computador){
        this.computador = computador;
    }

    @Override
    public void hacer(){
        computador.reiniciar();
    }
}
