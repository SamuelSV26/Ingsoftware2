package pregunta1;

public class Orden{
    public void calcularTotal(double precio, double descuento){
        if(descuento < 0 || descuento == 0){
          double impuesto = precio * 0.1;
          System.out.println("EL precio total es de: " + (precio + impuesto));
        }else{
            double descuentoP = precio - descuento;
            double impuesto = precio * 0.1;
            System.out.println("EL precio total con descuetos e impuestos es de: " + (descuentoP + impuesto));
        }
    }
}
