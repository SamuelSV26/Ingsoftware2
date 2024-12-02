package pregunta5;

public class Control {
    private Comando comando;

    public Control(Comando comando){
        this.comando = comando;
    }

    public void hacer(){
        comando.hacer();
    }
}
