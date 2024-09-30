package PrincipioExpertoTaller10;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private double precio;
    private int cantidad;

    public Libro(String titulo, String autor, String isbn, double precio, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }
}