package tallerISP2;

public class PaquetePequeño extends Paquete implements IPaquetePequeño {
    private int valor = 10;

    public PaquetePequeño(int peso, int dimensiones, int valor) {
        super(peso, dimensiones);
        this.valor = valor;
    }

    @Override
    public void calcularCostoEnvioPequeño() {
        System.out.println("El costo de envio de un paquete pequeño es de: " + (valor * 0.1));
    }   
}
