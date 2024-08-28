package tienda;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String producto = scanner.nextLine();

        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.print("Ingrese el valor: ");
        double valor = scanner.nextDouble();

        factura Factura = new factura();
        calculoImpuestoSaludable CalculoImpuestoSaludable = new calculoImpuestoSaludable(producto, cantidad, valor);
        calculoImpuestoReteIva CalculoImpuestoReteIva = new calculoImpuestoReteIva(producto, cantidad, valor);  
        calculoImpuestoIva CalculoImpuestoIva = new calculoImpuestoIva(producto, cantidad, valor);

        double impuestoSaludable = Factura.calcularImpuesto(CalculoImpuestoSaludable);
        double impuestoReteIva =Factura.calcularImpuesto(CalculoImpuestoReteIva);
        double iva = Factura.calcularImpuesto(CalculoImpuestoIva);


        System.out.println("El impuesto de salud para el producto: " + producto + " es: " + impuestoSaludable);
        System.out.println("El impuesto de reteiva para el producto: " + producto + " es: " + impuestoReteIva);
        System.out.println("El impuesto de iva para el producto: " + producto + " es: " + iva);
        System.out.println("El precio total con IVA e impusto de saludable es de: " + (valor + iva + impuestoSaludable));

    }
}


