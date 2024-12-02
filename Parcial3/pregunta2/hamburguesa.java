package pregunta2;

public class hamburguesa {
    private String tipoTomate;
    private String tipoCarne;
    private String tipoQueso;
    private String tipoPan;


    public hamburguesa(hamburguesaBuilder builder){
        this.tipoTomate = builder.tipoTomate;
        this.tipoQueso = builder.tipoQueso;
        this.tipoCarne = builder.tipoCarne;
        this.tipoPan = builder.tipoPan;
    }

    @Override
    public String toString() {
        return "hamburguesa: " +
                "tipo de tomate '" + tipoTomate + '\'' +
                ", tipo de carne '" + tipoCarne + '\'' +
                ", tipo de queso '" + tipoQueso + '\'' +
                ", tipo de pan '" + tipoPan + '\'';
    }

}
