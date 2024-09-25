// Se hace en el mismo archivo para entregar el taller en una solo archivo
//importar libreria 
import java.util.Arrays;

public class TallerKISS9 {
    public static void main(String[] args) {
        System.out.println(invertirCadena("Hola Mundo"));
        
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(encontrarMayor(numeros));
    }

    // invertirCadena KISS
    public static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    // encontrar Mayor KISS
    public static int encontrarMayor(int[] numeros) {
        return Arrays.stream(numeros).max().getAsInt();
    }
}

