package SingletonTaller17;


public class Main {
    public static void main(String[] args) {
        Settings settings = Settings.getInstancia();
        System.out.println(settings.getSetting("theme"));
        System.out.println(settings.getSetting("language"));

        Settings otherSettings = Settings.getInstancia();
        System.out.println("Son la misma instancia: " + (settings == otherSettings));
        
    }
}
