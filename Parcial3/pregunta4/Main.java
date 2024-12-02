package pregunta4;

public class Main {
    public static void main(String[] args) {
        Configuracion conf = Configuracion.getConfig();

        System.out.println(conf.getUrl());
        System.out.println(conf.getUsuario());
        System.out.println(conf.getPassw());

        Configuracion conf2 = Configuracion.getConfig();
        System.out.println("Son la misma configuracion: " + (conf ==  conf2));
    }
    
}
