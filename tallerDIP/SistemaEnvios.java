package tallerDIP;

public class SistemaEnvios {
    IProcesarOrdenUPS procesarOrdenUPS;
    IProcesarOrdenFedEx procesarOrdenFedEx;
    IProcesarOrdenDHL procesarOrdenDHL;

    public SistemaEnvios(IProcesarOrdenUPS procesarOrdenUPS, IProcesarOrdenFedEx procesarOrdenFedEx, IProcesarOrdenDHL procesarOrdenDHL) {
        this.procesarOrdenUPS = procesarOrdenUPS;
        this.procesarOrdenFedEx = procesarOrdenFedEx;
        this.procesarOrdenDHL = procesarOrdenDHL;
    }
    
    public void enviarOrdenUPS(Orden orden) {
        procesarOrdenUPS.enviarOrdenUPS(orden);
    }

    public void enviarOrdenFedEx(Orden orden) {
        procesarOrdenFedEx.enviarOrdenFedEx(orden);
    }

    public void enviarOrdenDHL(Orden orden) {
        procesarOrdenDHL.enviarOrdenDHL(orden);
    }

}
