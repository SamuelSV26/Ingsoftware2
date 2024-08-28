package tienda;

public class calculoImpuestoReteIva extends calculo{

    public calculoImpuestoReteIva(String producto, int cantidad, double precio){
        super(producto, cantidad, precio);
    }
    
    @Override        
    public double calcular(){
        return precio * 0.15;
    }
}
