package PrincipioControladorTaller10;

import java.util.ArrayList;
import java.util.List;

public class ControladorEntrada {
    private List<Entrada> entradas = new ArrayList<>();

    public void comprarEntrada(TipoEntrada tipo) {
        Entrada entrada = buscarEntrada(tipo);
        if (entrada != null && entrada.isDisponible()) {
            entrada.setDisponible(false);
            System.out.println("Entrada "+ tipo +" comprada");
        } else {
            System.out.println("Entrada "+ tipo +" no disponible");
        }
    }
    private Entrada buscarEntrada(TipoEntrada tipo) {
        for(Entrada entrada : entradas) {
            if(entrada.getTipo().equals(tipo)) {
                return entrada;
            }
        }
        return null;
    }


    public void agregarEntrada(TipoEntrada tipo, double precio, boolean disponible) {
        Entrada entrada = new Entrada(tipo, precio, disponible);
        entradas.add(entrada);
    }
}
