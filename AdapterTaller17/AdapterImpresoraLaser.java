package AdapterTaller17;

public class AdapterImpresoraLaser implements IImpresora {
    private ImpresoraLaser impresoraLaser;

    public AdapterImpresoraLaser(ImpresoraLaser impresoraLaser) {
        this.impresoraLaser = impresoraLaser;
    }

    @Override
    public void imprimir() {
        this.impresoraLaser.imprimirLaser();
    }
    
}
