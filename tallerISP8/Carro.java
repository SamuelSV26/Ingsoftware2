package tallerISP8;

public class Carro implements TransporteVehiculo {
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void obetenerMarca() {
        System.out.println("Marca: " + marca);
    }

    @Override
    public void obtenerModelo() {
        System.out.println("Modelo: " + modelo);
    }

    @Override
    public void comprarSoat() {
        System.out.println("Comprando SOAT");
    }

    @Override
    public void comprarTecnicoMecanico() {
        System.out.println("Comprando tecnico mecanico");
    }
    
}
