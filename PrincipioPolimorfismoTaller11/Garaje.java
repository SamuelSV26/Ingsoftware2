package PrincipioPolimorfismoTaller11;

public class Garaje {
    public void estacionar(ITransporte transporte){
        System.err.println("Estacionando transporte");
        transporte.mostrarInformacion();
    }
}
