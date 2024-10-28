package PatronAbstractFactoryTaller15;

public class main {
    public static void main(String[] args) {
        IFabricaMuebles fabricaMuebles = new FabricaMueblesModernos();
        ISilla silla = fabricaMuebles.crearSilla();
        IMueble mueble = fabricaMuebles.crearMueble();
        silla.crear();
        mueble.crear();

        fabricaMuebles = new FabricaMueblesClasicos();
        silla = fabricaMuebles.crearSilla();
        mueble = fabricaMuebles.crearMueble();
        silla.crear();
        mueble.crear();
    }
}
