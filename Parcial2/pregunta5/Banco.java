package pregunta5;
import java.util.List;

public class Banco {
    List<Cuentas> cuentas;
    
    public Banco(){}
    public List<Cuentas>getCuentas(){
        return cuentas;
    }

    public void depositar(String numeroCuenta, double cantidad){
        if (cantidad <= 0){
            throw new IllegalArgumentException("cantidad debe ser mayor a 0");
        }
        for (Cuentas cuentas: cuentas){
            if (cuentas.getNumeroCuenta().equals(numeroCuenta)){
                double saldo = cuentas.getSaldo() + cantidad;
                cuentas.setSaldo(saldo);
                return;
            }
        } 
        throw new IllegalArgumentException("No existe el numero de cuenta");
    }

    public void reteriar(String numeroCuenta, double cantidad){
        if (cantidad <= 0){
            throw new IllegalArgumentException("cantidad debe ser mayor a 0");
        }
        for (Cuentas cuentas: cuentas){
            if (cuentas.getNumeroCuenta().equals(numeroCuenta)){
                if(cantidad > cuentas.getSaldo()){
                    throw new IllegalArgumentException("Fondos no suficientes");
                }
                double saldo = cuentas.getSaldo() - cantidad;
                cuentas.setSaldo(saldo);
                return;
            }
        } 
        throw new IllegalArgumentException("No existe el numero de cuenta");
    }

    public boolean existeCuenta(String titular){
        for(Cuentas cuentas:cuentas){
            if(cuentas.getTitular().equals(titular)){
                return true;
            }
        }
        return false;
    }

}
