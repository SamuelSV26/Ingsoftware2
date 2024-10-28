package PatronBuilderTaller16;

public class main {
    public static void main(String[] args) {
        Usuario usuario =  new Usuario.UsuarioBuilder()
                .setNombre("Juan")
                .setEdad(25)
                .setCorreo("")
                .addInteres("Cine")
                .addInteres("Deportes")
                .build();

        System.out.println(usuario);
}
