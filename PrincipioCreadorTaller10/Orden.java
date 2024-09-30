package PrincipioCreadorTaller10;
import java.util.ArrayList;
import java.util.List;

public class Orden {
    private List<Computadora> computadoras = new ArrayList<>();
    private FabricarPC fabricarPC = new FabricarPC();

    public void agregarComputadora(String procesador, String tarjetaGrafica, String ram) {
        Computadora computadora = fabricarPC.crearComputadora(procesador, tarjetaGrafica, ram);
        computadoras.add(computadora);
    }

    public void getOrden() {
        for (Computadora computadora : computadoras) {
            System.out.println("Procesador: " + computadora.getProcesador());
            System.out.println("Tarjeta gráfica: " + computadora.getTarjetaGrafica());
            System.out.println("RAM: " + computadora.getRam());
            System.out.println();
        }
    }
}
