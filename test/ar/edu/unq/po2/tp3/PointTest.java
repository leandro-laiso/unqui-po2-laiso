package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

    private Point p1 = new Point();
    private Point p2 = new Point(2,6);
    private Point p3 = new Point(1,1);

    @Test
    public void testInstanciaPointSinParametros() {
        assertEquals(0, p1.getX());
        assertEquals(0, p1.getY());
    }

    @Test
    public void testInstanciaPointConParametros() {
        assertEquals(2, p2.getX());
        assertEquals(6, p2.getY());
    }

    @Test
    public void testMoverPoint() {
        p2.setXY(3, 7);
        assertEquals(3, p2.getX());
        assertEquals(7, p2.getY());
    }

    @Test
    public void testSumarPoint() {
        Point p4 = p2.add(p3);
        assertEquals(3, p4.getX());
        assertEquals(7, p4.getY());
    }

}
