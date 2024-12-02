package pregunta4;

public class Configuracion {
    private static Configuracion config;

    private String url;
    private String usuario;
    private String passw;

    private Configuracion(){
        this.url = "localhot";
        this.usuario = "admin";
        this.passw = "123";
    }

    public static Configuracion getConfig(){
        if (config == null){
            config = new Configuracion();
        }
        return config;
    }

    public String getUrl() {
        return url;
    }

    public String getPassw() {
        return passw;
    }

    public String getUsuario() {
        return usuario;
    }

}
