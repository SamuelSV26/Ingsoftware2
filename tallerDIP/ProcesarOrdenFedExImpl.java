package tallerDIP;

public class ProcesarOrdenFedExImpl implements IProcesarOrdenFedEx {

    @Override
    public void enviarOrdenFedEx(Orden orden) {
        System.out.println("Procesando orden FedEx");
        System.out.println("Origen: " + orden.getOrigen());
        System.out.println("Destino: " + orden.getDestino());
    }

}
