package pregunta5;

public class CelularSuspenderComando implements Comando{
    private Celular celular;

    public CelularSuspenderComando(Celular celular){
        this.celular = celular;
    }

    @Override
    public void hacer(){
        celular.suspender();
    }
    
}
