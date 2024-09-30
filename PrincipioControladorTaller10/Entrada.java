package PrincipioControladorTaller10;

public class Entrada {
    private TipoEntrada tipo;
    private double precio;
    private boolean disponible;

    public Entrada(TipoEntrada tipo, double precio, boolean disponible) {
        this.tipo = tipo;
        this.precio = precio;
        this.disponible = disponible;
    }

    public TipoEntrada getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
