package tallerLSP;

public class main {
    public static void main(String[] args) {
        productoFisico productoF = new productoFisico("Producto 1", 100, 2, 2);
        productoDigital productoD = new productoDigital("Producto 2", 100, 2, 2);
        productosMixtos productoM = new productosMixtos("Producto 3", 100, 2, 2, 2);

        inventario Inventario = new inventario();

        System.out.println("producto fisico: " + Inventario.calcular(productoF));
        productoF.enviarCorreo();
        System.out.println(Inventario.calcular(productoD));
        System.out.println("producto mixto: " + Inventario.calcular(productoM));
        productoM.enviarCorreo();
    }
}