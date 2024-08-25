import java.util.Scanner;

class Factura {
    private String id;
    private String valorTotal;
    private String producto;

    public Factura() {
    }

    public Factura(String id, String valorTotal, String producto) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.producto = producto;
    }

    public String getId() {
        return id;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public String getProducto() {
        return producto;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
}

class Cliente {
    private String id;
    private String nombre;
    private String apellido;
    private String email;

    public Cliente() {
    }

    public Cliente(String id, String nombre, String apellido, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }
}

class GuardarFactura {
    public void guardarFactura(Factura factura) {
        factura.setId(factura.getId());
        factura.setValorTotal(factura.getValorTotal());
        factura.setProducto(factura.getProducto());
        System.out.println("Guardando factura ");
        System.out.println("ID: " + factura.getId());
        System.out.println("Valor total: " + factura.getValorTotal());
        System.out.println("Producto: " + factura.getProducto());
    }
}

class EnviarEmailFactura {
    public void enviarEmailFactura(Cliente cliente, Factura factura) {
        if (cliente.getEmail() == null) {
            System.out.println("No se puede enviar la factura si no se tiene un email");
            return;
        }else if(factura.getId() == null) {
            System.out.println("No se puede enviar la factura si no se ha guardado");
            return;
        }else{
        System.out.println("Enviando factura por email a " + cliente.getEmail());
        System.out.println("ID: " + factura.getId());
        System.out.println("Valor total: " + factura.getValorTotal());
        System.out.println("Producto: " + factura.getProducto());
        }
    }
}

class GuardarCliente {
    public void guardarCliente(Cliente cliente) {
        cliente.setNombre(cliente.getNombre());
        cliente.setApellido(cliente.getApellido());
        cliente.setEmail(cliente.getEmail());
        cliente.setId(cliente.getId());
        System.out.println("Nuevo cliente guardado: ");
        System.out.println("ID: " + cliente.getId());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Apellido: " + cliente.getApellido());
        System.out.println("Email: " + cliente.getEmail());
    }
}

class GenerarReporteFactura {
    public void generarReporte(Factura factura) {
        if (factura.getId() == null) {
            System.out.println("No se puede generar el reporte si no existen facturas");
            return;
        }else{
        System.out.println("Generando reporte de factura");
        System.out.println("ID: " + factura.getId());
        System.out.println("Valor total: " + factura.getValorTotal());
        System.out.println("Producto: " + factura.getProducto());
        }
    }
}

class EnviarFacturaDian {
    public void enviarFacturaDian(Factura factura) {
        if (factura.getId() == null) {
            System.out.println("No se puede enviar la factura si no se ha guardado");
            return;
        }else{
        System.out.println("Enviando factura a la DIAN");
        System.out.println("ID: " + factura.getId());
        System.out.println("Valor total: " + factura.getValorTotal());
        System.out.println("Producto: " + factura.getProducto());
    }
    }
}

public class tallerSRP2 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Factura factura = new Factura();
        GuardarCliente guardarCliente = new GuardarCliente();
        GuardarFactura guardarFactura = new GuardarFactura();

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Crear cliente");
            System.out.println("2. Crear factura");
            System.out.println("3. Generar reporte de factura");
            System.out.println("4. Enviar factura a la DIAN");
            System.out.println("5. Enviar factura por email");
            System.out.println("6. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del cliente");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el apellido del cliente");
                    String apellido = scanner.nextLine();
                    System.out.println("Ingrese el id del cliente");
                    String id = scanner.nextLine();
                    System.out.println("Ingrese el email del cliente");
                    String email = scanner.nextLine();
                    cliente = new Cliente(id, nombre, apellido, email);
                    guardarCliente.guardarCliente(cliente);
                    break;
                case 2:
                    System.out.println("Ingrese el id de la factura");
                    String facturaId = scanner.nextLine();
                    System.out.println("Ingrese el valor total de la factura");
                    String valorTotal = scanner.nextLine();
                    System.out.println("Ingrese el producto de la factura");
                    String producto = scanner.nextLine();
                    factura = new Factura(facturaId, valorTotal, producto);
                    guardarFactura.guardarFactura(factura);
                    break;
                case 3: 
                    GenerarReporteFactura generarReporteFactura = new GenerarReporteFactura();
                    generarReporteFactura.generarReporte(factura);
                    break;
                case 4:
                    EnviarFacturaDian enviarFacturaDian = new EnviarFacturaDian();
                    enviarFacturaDian.enviarFacturaDian(factura);
                    break;
                case 5:
                    EnviarEmailFactura enviarEmailFactura = new EnviarEmailFactura();
                    enviarEmailFactura.enviarEmailFactura(cliente, factura);
                    break;
            }
        } while (opcion != 6);
    }
}