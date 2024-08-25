import java.util.Scanner;

interface Envio {
   double getCostoEnvio();
}

class EnvioEstandar implements Envio {
   private double peso, distancia;

   public EnvioEstandar(double peso, double distancia) {
      this.peso = peso;
      this.distancia = distancia;
   }

   @Override
   public double getCostoEnvio(){
      return (peso * 0.5 + distancia * 0.1);
   }
}

class EnvioExpress implements Envio {
   private double peso, distancia;

   public EnvioExpress(double peso, double distancia) {
      this.peso = peso;
      this.distancia = distancia;
   }

   @Override
   public double getCostoEnvio() {
      return (peso * 1.0 + distancia * 0.2);
   }

}

class EnvioInternacional implements Envio {
   private double peso, distancia;

   public EnvioInternacional(double peso, double distancia) {
      this.peso = peso;
      this.distancia = distancia;
   }

   @Override
   public double getCostoEnvio() {
      return (peso * 1.5 + distancia * 0.5);
   }
}

public class TallerOCP {
   public static void main(String[] args) {
      Envio envio = null;
      int opcion;
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingrese el peso del paquete en kilogramos: ");
      double peso = scanner.nextDouble();
      System.out.print("Ingrese la distancia a recorrer en kilometros: ");
      double distancia = scanner.nextDouble();

         System.out.println("Seleccione el tipo de envio:");
         System.out.println("1. Envio estandar");
         System.out.println("2. Envio express");
         System.out.println("3. Envio internacional");

         opcion = scanner.nextInt();
         String nombreEnvio = "";

         switch (opcion) {
            case 1:
               envio = new EnvioEstandar(peso, distancia);
               nombreEnvio = "Estandar";
               break;
            case 2:
               envio = new EnvioExpress(peso, distancia);
               nombreEnvio = "Express";
               break;
            case 3:
               envio = new EnvioInternacional(peso, distancia);
               nombreEnvio = "Internacional";
               break;             
            default:
               System.out.println("Opción no valida. Intente de nuevo.");
         }
         System.out.println("el Costo para el envio de tipo " + nombreEnvio + " es de: " + envio.getCostoEnvio());
         scanner.close();
      }
   }
