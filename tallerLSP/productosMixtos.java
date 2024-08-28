package tallerLSP;

public class productosMixtos extends producto implements enviar {
    double peso;
    double tamanioArch;

    public productosMixtos(String nombre, double precio, int cantidad, double peso, double tamanioArch) {
        super(nombre, precio, cantidad);
        this.peso = peso;
        this.tamanioArch = tamanioArch;
    }

    @Override
    double calcularPrecio() {
        return (precio * cantidad * peso * tamanioArch);
    }

    @Override
    public void enviarCorreo(){
        System.out.println("Enviando correo de producto mixto");
    }
}
