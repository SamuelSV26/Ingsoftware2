package pregunta1;

public class Libro {
    private String titulo;
    private String autor;
    private int precio;
    private String año;

    public Libro(String titulo, String autor, int precio, String año){
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.año = año;
    }

    public String getAutor() {
        return autor;
    }

    public int getPrecio() {
        return precio;
    }

    public String getAño() {
        return año;
    }

    public String getTitulo() {
        return titulo;
    }


    public void añadirlibro(){
        
    }

}
