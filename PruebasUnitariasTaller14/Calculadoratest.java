package PruebasUnitariasTaller14;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.RepeatedTest;

public class Calculadoratest {

    private static Calculadora calculadora;

    @BeforeAll
    public static void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3));
        assertNotEquals(9, calculadora.sumar(5,6 ));
    }

    @Test
    public void testRestar() {
        assertEquals(1, calculadora.restar(3, 2));
        assertTrue(calculadora.restar(5, 3) > 0);

    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertFalse(calculadora.multiplicar(3, 5) > 16); 
    }

    @Test
    public void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3));
    }

    @Test
    public void testDividirPorCero() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(6, 0));
    }

    @Test
    @RepeatedTest(5)
    public void testSumarRepetido() {
        assertEquals(7, calculadora.sumar(4, 3));
    }
}

