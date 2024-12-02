package pregunta2;

public class hamburguesaBuilder {
    public String tipoTomate;
    public String tipoCarne;
    public String tipoQueso;
    public String tipoPan;

    public hamburguesaBuilder setTipoTomate(String tipoTomate){
        this.tipoTomate = tipoTomate;
        return this;
    }
    public hamburguesaBuilder setTipoCarne(String tipoCarne){
        this.tipoCarne = tipoCarne;
        return this;
    }
    public hamburguesaBuilder setTipoQueso(String tipoQueso){
        this.tipoQueso = tipoQueso;
        return this;
    }
    public hamburguesaBuilder setTipoPan(String tipoPan){
        this.tipoPan = tipoPan;
        return this;
    }

    public hamburguesa build() {
        return new hamburguesa(this);
    }
}
