package PruebasUnitarias;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio1Test {

    @Test
    public void testCalcularNotaCurso1() {
        double[] notasParciales = {3.5, 4.0, 3.8, 4.2};
        double notaEsperada = 3.875; // (3.5 + 4.0 + 3.8 + 4.2) / 4
        assertEquals(notaEsperada, Ejercicio1.calcularNotaCurso1(notasParciales), 0.001);
    }

    @Test
    public void testCalcularNotaCurso2() {
        double[] notasParciales = {3.5, 4.0, 3.8, 4.2};
        double notaEsperada = 3.89; // (3.5*0.15 + 4.0*0.30 + 3.8*0.35 + 4.2*0.20)
        assertEquals(notaEsperada, Ejercicio1.calcularNotaCurso2(notasParciales), 0.01);
    }

    @Test
    public void testCalcularNotaCurso2ConNotasIncorrectas() {
        double[] notasParciales = {3.5, 4.0, 3.8}; // Deberían ser 4 notas parciales
        assertThrows(IllegalArgumentException.class, () -> {
            Ejercicio1.calcularNotaCurso2(notasParciales);
        });
    }
}
