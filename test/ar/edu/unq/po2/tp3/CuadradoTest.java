package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CuadradoTest {

    private Cuadrado c1 = new Cuadrado(new Point(4,4), 6);

    @Test
    public void testConstructorCuadrado() {
        assertEquals(4, c1.getEsqSupIzq().getX());
        assertEquals(4, c1.getEsqSupIzq().getY());
        assertEquals(6, c1.getTamaño());
    }

    @Test
    public void testAreaCuadrado() {
        assertEquals(36, c1.area());
    }

    @Test
    public void testPerimetroCuadrado() {
        assertEquals(24, c1.perimetro());
    }

    @Test public void testHorizontalVerticalCuadrado() {
        assertFalse(c1.esHorizontal());
        assertFalse(c1.esVertical());
    }
}
