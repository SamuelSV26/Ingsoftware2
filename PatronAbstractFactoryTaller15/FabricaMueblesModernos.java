package PatronAbstractFactoryTaller15;

public class FabricaMueblesModernos implements IFabricaMuebles {

    @Override
    public ISilla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public IMueble crearMueble() {
        return new MesaModerna();
    }
    
}
