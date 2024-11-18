package AdapterTaller17;

public class Main {
    public static void main(String[] args) {
        ImpresoraInJet impresoraInJet = new ImpresoraInJet();
        ImpresoraLaser impresoraLaser = new ImpresoraLaser();

        AdapterImpresoraInJet adapterImpresoraInJet = new AdapterImpresoraInJet(impresoraInJet);
        AdapterImpresoraLaser adapterImpresoraLaser = new AdapterImpresoraLaser(impresoraLaser);
        
        adapterImpresoraInJet.imprimir();
        adapterImpresoraLaser.imprimir();
    }
}
