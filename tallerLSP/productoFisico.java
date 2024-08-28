package tallerLSP;

public class productoFisico extends producto implements enviar{
    double peso;

    public productoFisico(String nombre, double precio, int cantidad, double peso) {
        super(nombre, precio, cantidad);
        this.peso = peso;
    }

    @Override
    public double calcularPrecio() {
        return (precio * cantidad * peso);
    }
    @Override
    public void enviarCorreo(){
        System.out.println("Enviando por correo producto fisico");
    }
}
