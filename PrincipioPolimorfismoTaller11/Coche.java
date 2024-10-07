package PrincipioPolimorfismoTaller11;

public class Coche implements ITransporte {
    @Override
    public void acelerar() {
        System.out.println("Acelerando coche");
    }
    public void frenar() {
        System.out.println("Frenando coche");
    }
    public void mostrarInformacion() {
        System.out.println("Coche");
    }

}
