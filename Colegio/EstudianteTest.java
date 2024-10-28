package Colegio;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class EstudianteTest {
        private static Estudiante estudiante;

    @BeforeAll
    public static void setUp() {
        estudiante = new Estudiante("Samuel", 19);
        List<Double> calificaciones = new ArrayList<>();
        double calificacion1 = 5.2, calificacion2 = 7, calificacion3 = 6.9;
        calificaciones.add(calificacion1);
        calificaciones.add(calificacion2);
        calificaciones.add(calificacion3);
        estudiante.setCalificaciones(calificaciones);
    }


    
    @Test
    public void obtenerPromedioTest() {
        double promedioEsperado = (5.2 + 7 + 6.9) / 3; // = 6.366666666666666
        assertEquals( promedioEsperado, estudiante.obtenerPromedio(), 0.001);
    }

    @Test
    public void agregarCalificacionTest() {
        estudiante.agregarCalificacion(9.5);
        assertEquals(4, estudiante.getNumeroCalificaciones());
    }

    @Test
    public void getNumeroCalificacionesTest() {
        assertEquals(3, estudiante.getNumeroCalificaciones());
    }

    @Test
    public void agregarCalificacionExcepcionTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            estudiante.agregarCalificacion(-1);
        });
        assertEquals("La calificación debe estar entre 0 y 10", exception.getMessage());
    }

    @AfterAll
    public static void AfterAll() {
        System.out.println("Finalizar pruebas unitarias");
    }
}
