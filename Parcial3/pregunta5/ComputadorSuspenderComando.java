package pregunta5;

public class ComputadorSuspenderComando implements Comando{
    private Computador computador;

    public ComputadorSuspenderComando(Computador computador){
        this.computador = computador;
    }

    @Override
    public void hacer(){
        computador.suspender();
    }
    
}
