package PrincipioFPuraTaller11;
import java.util.Date;
import java.util.List;

public class FabricaPedidos {
    
    public Cliente crearCliente(String nombre, String direccion) {
        return new Cliente(nombre, direccion);
    }
    
    public Producto crearProducto(String nombre, double precio, int cantidad) {
        return new Producto(nombre, precio, cantidad);
    }

    public Pedido crearPedido(int id, Date date,Cliente cliente, List<Producto> productos) {
        return new Pedido(id, new Date(), cliente, productos);
    }
}