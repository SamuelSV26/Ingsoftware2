package tallerDIP;
import java.util.Date;

public class Orden {
    private String origen;
    private String destino;
    private Date fecha;

    public Orden(String origen, String destino, Date fecha) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }
    public String getOrigen() {
        return origen;
    }
    public String getDestino() {
        return destino;
    }
    public Date getFecha() {
        return fecha;
    }
    
}
