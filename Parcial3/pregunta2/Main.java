package pregunta2;

public class Main {
    public static void main(String[] args) {
        hamburguesa hamburguesa =  new  hamburguesaBuilder()
                .setTipoCarne("Angus")
                .setTipoPan("bimbo")
                .setTipoQueso("no se")
                .setTipoTomate("tomate")
                .build();

        System.out.println(hamburguesa);
    }
}
