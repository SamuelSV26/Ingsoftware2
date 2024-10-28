package PatronAbstractFactoryTaller15;

public class FabricaMueblesClasicos implements IFabricaMuebles {

    @Override
    public ISilla crearSilla() {
        return new SillaClasica();
    }

    @Override
    public IMueble crearMueble() {
        return new MesaClasica();
    }
    
}
