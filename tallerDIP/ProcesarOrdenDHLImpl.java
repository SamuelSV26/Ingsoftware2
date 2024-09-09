package tallerDIP;

public class ProcesarOrdenDHLImpl implements IProcesarOrdenDHL {

    @Override
    public void enviarOrdenDHL(Orden orden) {
        System.out.println("Procesando orden DHL");
        System.out.println("Origen: " + orden.getOrigen());
        System.out.println("Destino: " + orden.getDestino());
    }

}
