package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectanguloTest {

    private Rectangulo r1 = new Rectangulo(new Point(2, 3), 4, 3);
    private Rectangulo r2 = new Rectangulo(4, 3);

    @Test
    public void testConstructorRectanguloConParametros() {
        assertEquals(2, r1.getEsqSupIzq().getX());
        assertEquals(3, r1.getEsqSupIzq().getY());
        assertEquals(4, r1.getBase());
        assertEquals(3, r1.getAltura());
    }

    @Test
    public void testConstructorRectanguloSinParametros() {
        assertEquals(0, r2.getEsqSupIzq().getX());
        assertEquals(0, r2.getEsqSupIzq().getY());
        assertEquals(4, r2.getBase());
        assertEquals(3, r2.getAltura());
    }

    @Test
    public void testAreaRectangulo() {
        assertEquals(12, r1.area());
        assertEquals(12, r2.area());
    }

    @Test
    public void testPerimetroRectangulo() {
        assertEquals(14, r1.perimetro());
        assertEquals(14, r2.perimetro());
    }

    @Test
    public void testHorizontalRectangulo() {
        assertTrue(r1.esHorizontal());
        assertTrue(r2.esHorizontal());
    }

    @Test
    public void testVerticalRectangulo() {
        assertFalse(r1.esVertical());
        assertFalse(r2.esVertical());
    }

}
