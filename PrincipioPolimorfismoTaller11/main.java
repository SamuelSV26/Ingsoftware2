package PrincipioPolimorfismoTaller11;

public class main {
    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        Avion avion = new Avion();
        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();
        Moto  moto = new Moto();

        garaje.estacionar(avion);
        garaje.estacionar(bicicleta);
        garaje.estacionar(coche);
        garaje.estacionar(moto);
    }
    
}
