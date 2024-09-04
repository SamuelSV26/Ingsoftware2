package tallerISP2;

public class PaquetePeligroso extends Paquete implements IPaquetePeligroso {
    private String etiquetasPeligro;
    private boolean EmbalajeEspecial; 

    public PaquetePeligroso(int peso, int dimensiones, String etiquetasPeligro, boolean EmbalajeEspecial) {
        super(peso, dimensiones);
        this.etiquetasPeligro = etiquetasPeligro;
        this.EmbalajeEspecial = EmbalajeEspecial;
    }

    @Override
    public void asegurarPaquetePeligroso() {
        if (EmbalajeEspecial == true) {
            System.out.println("El paquete peligroso ha sido asegurado");
        } else {
            System.out.println("El paquete peligroso no ha sido asegurado");
        }
    }
    @Override
    public void verificarContenidoPeligroso() {
        if (etiquetasPeligro == "Explosivo") {
            System.out.println("El contenido del paquete peligroso ha sido verificado");
        } else {
            System.out.println("El contenido del paquete peligroso no ha sido verificado");
        }
    }

}
