package pregunta5;

public class CelularEncenderComando implements Comando {
    private Celular celular;

    public CelularEncenderComando(Celular celular){
        this.celular = celular;
    }

    @Override
    public void hacer(){
        celular.encender();
    }
    
}
