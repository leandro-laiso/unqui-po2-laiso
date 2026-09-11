package ar.edu.unq.po2.tp5.ej2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductoTest {

    private Producto arroz;

    @BeforeEach
    public void setUp() {
        arroz = new Producto(15.0, 20);
    }

    @Test
    public void testConstructor() {
        assertEquals(15.0, arroz.getPrecio());
        assertEquals(20, arroz.getStock());
    }

    @Test
    public void testDecrementarStock() {
        assertEquals(20, arroz.getStock());
        arroz.decrementarStock();
        assertEquals(19, arroz.getStock());
        arroz.decrementarStock();
        assertEquals(18, arroz.getStock());
    }

}
