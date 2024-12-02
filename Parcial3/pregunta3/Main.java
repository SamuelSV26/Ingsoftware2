package pregunta3;

public class Main {
    public static void main(String[] args) {
        NuevoSistemaPago sistemaNuevo = new NuevoSistemaPago();
        IOperacionesPago adaptador = new AdapNuevoSistemaPago(sistemaNuevo);
        sistemaNuevo.setCorreo("samuel@gmail");
        sistemaNuevo.setNombre("samuel");
        adaptador.cerrarSesion();
        adaptador.validarCorreo();
        adaptador.validarAut();
        adaptador.realizarPago();
    }      
}
