package PrincipioFPuraTaller11;
import java.util.Date;
import java.util.List;

public class main {
    public static void main(String[] args) {
        FabricaPedidos fabrica = new FabricaPedidos();
        Cliente cliente = fabrica.crearCliente("Juan", "Calle 123");
        Producto producto = fabrica.crearProducto("Cargador", 100, 2);
        Producto producto2 = fabrica.crearProducto("Celular", 450, 1);
        Producto producto3 = fabrica.crearProducto("Audifonos", 230, 1);
        Pedido pedido = fabrica.crearPedido(1, new Date(), cliente, List.of(producto, producto2, producto3));
        
        
        System.out.println("Productos del pedido ID: " + pedido.getId()+ " Y con fecha del: " + pedido.getFecha());
        System.out.println("Cliente: " + pedido.getCliente().getNombre());
        for (Producto p : pedido.getProductos()) {
            System.out.println("Nombre del producto: " + p.getNombre() + " Precio: " + p.getPrecio() + " Cantidad: " + p.getCantidad());
        }
    }
}
