package AdapterTaller17;

public class AdapterImpresoraInJet implements IImpresora {
    private ImpresoraInJet impresoraInJet;

    public AdapterImpresoraInJet(ImpresoraInJet impresoraInJet) {
        this.impresoraInJet = impresoraInJet;
    }

    @Override
    public void imprimir() {
        this.impresoraInJet.imprimirInJet();
    }
    
}
