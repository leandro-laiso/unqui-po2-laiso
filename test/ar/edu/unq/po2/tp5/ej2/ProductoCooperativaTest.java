package ar.edu.unq.po2.tp5.ej2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductoCooperativaTest {

    private ProductoCooperativa leche;

    @BeforeEach
    public void setUp() {
        leche = new ProductoCooperativa(10.0, 3);
    }

    @Test
    public void testStock() {
        assertEquals(3, leche.getStock());
    }

    @Test
    public void testPrecio() {
        assertEquals(9.0, leche.getPrecio());
    }

}
