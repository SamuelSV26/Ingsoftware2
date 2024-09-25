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
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libro.setAñoPublicacion(2024);
        libros.add(libro);
    }
}
