package pregunta5;

public class ComputadorApagarComando implements Comando {
    private Computador computador;

    public ComputadorApagarComando(Computador computador){
        this.computador = computador;
    }

    @Override
    public void hacer(){
        computador.apagar();
    }
    
}
