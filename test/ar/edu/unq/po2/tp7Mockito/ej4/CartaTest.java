package ar.edu.unq.po2.tp7Mockito.ej4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartaTest {

    // Definiciones
    private Carta diamanteAS;
    private Carta diamante3;
    private Carta picasK;

    // SETUP
    @BeforeEach
    public void setUp() {
        diamanteAS = new Carta(Valor.AS, "D");
        diamante3 = new Carta(Valor.TRES, "D");
        picasK    = new Carta(Valor.K, "P");
    }

    @Test
    public void testConstructor() {
        // EXERCISE
        Valor valor = diamanteAS.getValor();
        String palo = diamanteAS.getPalo();

        // VERIFY
        assertEquals(Valor.AS, valor);
        assertEquals("D", palo);
    }

    @Test
    public void testValorSuperiorAOtroCasoVerdadero() {
        // EXERCISE
        boolean esSuperior = diamanteAS.esValorSuperior(diamante3);

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
        boolean mismoPalo = diamanteAS.esDelMismoPalo(diamante3);

        // VERIFY
        assertTrue(mismoPalo);
    }

    @Test
    public void testMismoPaloCasoFalso() {
        // EXERCISE
        boolean mismoPalo = diamanteAS.esDelMismoPalo(picasK);

        // VERIFY
        assertFalse(mismoPalo);
    }

    // TEARDOWN
    @AfterEach
    public void teardown() {
        diamanteAS = null;
        diamante3 = null;
        picasK    = null;
    }
}
