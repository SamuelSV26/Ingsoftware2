package PrincipioCohesionAcoplamintoTaller11;
import java.util.ArrayList;
import java.util.List;

public class  Carro {
    private List<Producto> productos = new ArrayList<>();
    private DBProducto dbProducto = new DBProducto();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        dbProducto.guardarProducto(producto);
    }

    public void mostrarProductos() {
        System.out.println("Productos en el carrito:");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre());
        }
    }

    public double PrecioTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

}