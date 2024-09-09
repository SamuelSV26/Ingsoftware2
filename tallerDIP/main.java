package tallerDIP;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        IProcesarOrdenUPS procesarOrdenUPS = new ProcesarOrdenUPSImpl();
        IProcesarOrdenFedEx procesarOrdenFedEx = new ProcesarOrdenFedExImpl();
        IProcesarOrdenDHL procesarOrdenDHL = new ProcesarOrdenDHLImpl();
        SistemaEnvios sistemaEnvios = new SistemaEnvios(procesarOrdenUPS, procesarOrdenFedEx, procesarOrdenDHL);
        Orden orden = new Orden("Manizales","Bogota", new Date());
        
        sistemaEnvios.enviarOrdenUPS(orden);
        System.out.println("");
        sistemaEnvios.enviarOrdenFedEx(orden);
        System.out.println("");
        sistemaEnvios.enviarOrdenDHL(orden);
    }
}
