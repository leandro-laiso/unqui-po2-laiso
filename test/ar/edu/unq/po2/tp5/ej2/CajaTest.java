package ar.edu.unq.po2.tp5.ej2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CajaTest {

    private Caja caja;
    private Producto arroz;
    private ProductoCooperativa leche;

    @BeforeEach
    public void setUp() {
        caja = new Caja();
        arroz = new Producto(15.0, 20);
        leche = new ProductoCooperativa(10.0, 3);
    }

    @Test
    public void testConstructor() {
        assertEquals(0.0, caja.getMontoAPagar());
    }

    @Test
    public void testRegistrarProducto() {
        caja.registrarProducto(arroz);
        assertEquals(19, arroz.getStock());
        assertEquals(15.0, caja.getMontoAPagar());
        caja.registrarProducto(leche);
        assertEquals(2, leche.getStock());
        assertEquals(24.0, caja.getMontoAPagar());
    }


}
