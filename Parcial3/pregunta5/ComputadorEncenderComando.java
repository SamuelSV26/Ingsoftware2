package pregunta5;

public class ComputadorEncenderComando implements Comando {
    private Computador computador;

    public ComputadorEncenderComando(Computador computador){
        this.computador = computador;
    }

    @Override
    public void hacer(){
        computador.encender();
    }
    
}
