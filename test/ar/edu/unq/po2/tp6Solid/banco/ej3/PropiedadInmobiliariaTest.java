package ar.edu.unq.po2.tp6Solid.banco.ej3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropiedadInmobiliariaTest {

    private PropiedadInmobiliaria propiedad;

    @BeforeEach
    public void setUp() {
        propiedad = new PropiedadInmobiliaria("Casa", "Argentina", 500000.0);
    }

    @AfterEach
    public void teardown() {
        propiedad = null;
    }

    @Test
    public void testConstructor() {
        assertEquals("Casa", propiedad.getDescripción());
        assertEquals("Argentina", propiedad.getDirección());
        assertEquals(500000.0, propiedad.getValorFiscal());
    }

}
