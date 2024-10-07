package PrincipioPolimorfismoTaller11;

public class Bicicleta implements ITransporte {
    
    @Override
    public void acelerar() {
        System.out.println("Acelerando bicicleta");
    }
    public void frenar() {
        System.out.println("Frenando bicicleta");
    }
    public void mostrarInformacion() {
        System.out.println("Bicicleta");
    }
    
}
