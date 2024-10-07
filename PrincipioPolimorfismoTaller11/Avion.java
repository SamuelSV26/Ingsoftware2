package PrincipioPolimorfismoTaller11;

public class Avion implements ITransporte {
    @Override
    public void acelerar() {
        System.out.println("Acelerando avion");
    }
    public void frenar() {
        System.out.println("Frenando avion");
    }
    public void mostrarInformacion() {
        System.out.println("Avion");
    }
    
}
