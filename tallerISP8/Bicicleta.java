package tallerISP8;

public class Bicicleta implements TransporteBicicleta {
    private String marca;
    private String modelo;

    public Bicicleta(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void obtenerMarca() {
        System.out.println("Marca: " + marca);
    }

    @Override
    public void obtenerModelo() {
        System.out.println("Modelo: " + modelo);
    }
    
}
