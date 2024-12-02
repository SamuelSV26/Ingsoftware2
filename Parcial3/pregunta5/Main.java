package pregunta5;

public class Main {
        public static void main(String[] args) {
            
        Celular celular = new Celular();
        Computador computador = new Computador();

        Comando celularPrender = new CelularEncenderComando(celular);
        Comando celularApagar = new CelularApagarComando(celular);
        Comando celularSuspender = new CelularSuspenderComando(celular);
        Comando celularReiniciar = new CelularReiniciarComando(celular);

        Comando computadorPrender = new ComputadorEncenderComando(computador);
        Comando computadorApagar = new ComputadorApagarComando(computador);
        Comando computadorSuspender = new ComputadorSuspenderComando(computador);
        Comando computadorReiniciar = new ComputadorReiniciarComando(computador);


        Control control = new Control(celularPrender);
        control.hacer();
        control = new Control(celularApagar);
        control.hacer();
        control = new Control(celularSuspender);
        control.hacer();
        control = new Control(celularReiniciar);
        control.hacer();

        control = new Control(computadorPrender);
        control.hacer();
        control = new Control(computadorApagar);
        control.hacer();
        control = new Control(computadorSuspender);
        control.hacer();
        control = new Control(computadorReiniciar);
        control.hacer();
    }
}
