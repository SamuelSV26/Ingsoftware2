package PatronPrototypeTaller16;

public class Producto implements IPrototype {
    private String nombre;
    private double precio;
    private String Categoria;

    public Producto(String nombre, double precio, String Categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.Categoria = Categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return Categoria;
    }

    @Override
    public IPrototype clone() {
      return new Producto(this.nombre, this.precio, this.Categoria);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", Categoria='" + Categoria + '\'' +
                '}';
    }

}
