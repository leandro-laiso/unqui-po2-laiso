package ar.edu.unq.po2.tp7Mockito.ej4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartaTest {

    // Definiciones
    private Carta diamante1;
    private Carta diamante3;
    private Carta picasK;

    // SETUP
    @BeforeEach
    public void setUp() {
        diamante1 = new Carta("1", "D");
        diamante3 = new Carta("3", "D");
        picasK    = new Carta("K", "P");
    }

    @Test
    public void testConstructor() {
        // EXERCISE
        String valor = diamante1.getValor();
        String palo = diamante1.getPalo();

        // VERIFY
        assertEquals("1", valor);
        assertEquals("D", palo);
    }

    @Test
    public void testValorSuperiorAOtroCasoVerdadero() {
        // EXERCISE
        boolean esSuperior = diamante3.esValorSuperior(diamante1);

        // VERIFY
        assertTrue(esSuperior);
    }

    @Test
    public void testValorSuperiorAOtroCasoFalso() {
        // EXERCISE
        boolean esSuperior = diamante3.esValorSuperior(picasK);

        // VERIFY
        assertFalse(esSuperior);
    }

    @Test
    public void testMismoPaloCasoVerdadero() {
        // EXERCISE
        boolean mismoPalo = diamante1.esDelMismoPalo(diamante3);

        // VERIFY
        assertTrue(mismoPalo);
    }

    @Test
    public void testMismoPaloCasoFalso() {
        // EXERCISE
        boolean mismoPalo = diamante1.esDelMismoPalo(picasK);

        // VERIFY
        assertFalse(mismoPalo);
    }

    // TEARDOWN
    @AfterEach
    public void teardown() {
        diamante1 = null;
        diamante3 = null;
        picasK    = null;
    }
}
