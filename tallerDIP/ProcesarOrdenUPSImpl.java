package tallerDIP;

public class ProcesarOrdenUPSImpl implements IProcesarOrdenUPS {

    @Override
    public void enviarOrdenUPS(Orden orden) {
        System.out.println("Procesando orden UPS");
        System.out.println("Origen: " + orden.getOrigen());
        System.out.println("Destino: " + orden.getDestino());
    }

}
