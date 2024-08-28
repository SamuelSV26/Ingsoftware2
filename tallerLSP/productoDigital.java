package tallerLSP;

public class productoDigital extends producto{

    double tamanioArch;

    public productoDigital(String nombre,double precio, int cantidad ,double tamanioArch) {
        super(nombre, precio, cantidad);
        this.tamanioArch = tamanioArch;
    }

    @Override
    double calcularPrecio() {
        return (precio * cantidad * tamanioArch);
    }
    
}
