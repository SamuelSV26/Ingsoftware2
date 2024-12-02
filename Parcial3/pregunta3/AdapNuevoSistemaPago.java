package pregunta3;

public class AdapNuevoSistemaPago implements IOperacionesPago{
    private NuevoSistemaPago nuevoSistema;

    public AdapNuevoSistemaPago(NuevoSistemaPago nuevoSistema){
        this.nuevoSistema = nuevoSistema;
    }

    @Override
    public void cerrarSesion(){
        System.out.println("Cerrando Sesion: "+ nuevoSistema.getNombre());
    }

    public void validarCorreo(){
        System.out.println("Correo validado: "+ nuevoSistema.getCorreo());
    }

    public void validarAut(){
        System.out.println("Validando autorizacion" );
    }

    public void realizarPago(){
        System.out.println("Realizando Pago" );
    }

}
