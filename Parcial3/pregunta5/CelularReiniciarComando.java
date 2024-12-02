package pregunta5;

public class CelularReiniciarComando implements Comando {
    private Celular celular;

    public CelularReiniciarComando(Celular celular){
        this.celular = celular;
    }

    @Override
    public void hacer(){
        celular.reiniciar();
    }
}
