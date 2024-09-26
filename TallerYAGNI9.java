import java.util.ArrayList;
import java.util.List;

class Libro {
    String titulo;
    String autor;
    int añoPublicacion;
    // Constructor y getters

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
}

            //Biblioteca
public class TallerYAGNI9 {
    public static void main(String[] args) {
        TallerYAGNI9 biblioteca = new TallerYAGNI9();
        Libro libro = new Libro();
        libro.titulo = "El principito";
        libro.autor = "Yo";
        biblioteca.agregarLibro(libro);
        System.out.println(libro.añoPublicacion);
        
    }

    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libro.setAñoPublicacion(2024);
        libros.add(libro);
    }
}

