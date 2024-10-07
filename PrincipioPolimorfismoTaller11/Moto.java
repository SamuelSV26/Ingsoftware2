package PrincipioPolimorfismoTaller11;

public class Moto implements ITransporte {
    @Override
    public void acelerar() {
        System.out.println("Acelerando moto");
    }
    public void frenar() {
        System.out.println("Frenando moto");
    }
    public void mostrarInformacion() {
        System.out.println("Moto");
    }
    
}
