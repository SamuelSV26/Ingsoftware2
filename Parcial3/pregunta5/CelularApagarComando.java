package pregunta5;

public class CelularApagarComando implements Comando {
    private Celular celular;

    public CelularApagarComando(Celular celular){
        this.celular = celular;
    }

    @Override
    public void hacer(){
        celular.apagar();
    }
    
}
