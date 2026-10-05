package ar.edu.unq.po2.tp7Mockito.ej4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokerStatusTest {

    // Definiciones
    private PokerStatus poker = new PokerStatus();

    private Carta diamanteAS;
    private Carta diamante3;
    private Carta diamante4;
    private Carta diamante10;
    private Carta diamanteQ;

    private Carta picasAS;
    private Carta picas3;
    private Carta picas10;
    private Carta picasK;

    private Carta corazonAS;
    private Carta corazon3;
    private Carta corazon10;
    private Carta corazonJ;

    private Carta trebolAS;
    private Carta trebol3;
    private Carta trebol10;
    private Carta trebolK;


    // SETUP
    @BeforeEach
    public void setUp() {
        // P = picas, C = corazones, D = diamantes, T = tréboles
        diamanteAS  = new Carta(Valor.AS, "D");
        diamante3   = new Carta(Valor.TRES, "D");
        diamante4   = new Carta(Valor.CUATRO, "D");
        diamante10  = new Carta(Valor.DIEZ, "D");
        diamanteQ   = new Carta(Valor.Q, "D");

        picasAS     = new Carta(Valor.AS, "P");
        picas3      = new Carta(Valor.TRES, "P");
        picas10     = new Carta(Valor.DIEZ, "P");
        picasK      = new Carta(Valor.K, "P");

        corazonAS   = new Carta(Valor.AS, "C");
        corazon3    = new Carta(Valor.TRES, "C");
        corazon10   = new Carta(Valor.DIEZ, "C");
        corazonJ    = new Carta(Valor.J, "C");

        trebolAS    = new Carta(Valor.AS, "T");
        trebol3     = new Carta(Valor.TRES, "T");
        trebol10    = new Carta(Valor.DIEZ, "T");
        trebolK     = new Carta(Valor.K, "T");
    }

    @Test
    public void TestVerificarCasoCuatroCartasValor1() {
        // EXERCISE
        String resultado = poker.verificar(diamanteAS, picasAS, trebolAS, picasK, corazonAS);

        // VERIFY
        assertEquals("Poker", resultado);
    }

    @Test
    public void TestVerificarCasoTresCartasValor1DosValor10() {
        // EXERCISE
        String resultado = poker.verificar(picasAS, diamante10, corazon10, corazonAS, trebolAS);

        // VERIFY
        assertEquals("Trio", resultado);
    }

    @Test
    public void TestVerificarCasoCincoCartasDiamantes() {
        // EXERCISE
        String resultado = poker.verificar(diamanteAS, diamante10, diamante3, diamante4, diamanteQ);

        // VERIFY
        assertEquals("Color", resultado);
    }

    @Test
    public void TestVerificarCasoTodasCartasDistintas() {
        // EXERCISE
        String resultado = poker.verificar(picasAS, diamante4, corazon3, corazonJ, trebolK);

        // VERIFY
        assertEquals("Nada", resultado);
    }


    // TEARDOWN
    @AfterEach
    public void teardown() {
        diamanteAS = null;
        diamante3 = null;
        diamante4 = null;
        diamante10 = null;
        diamanteQ = null;

        picasAS = null;
        picas3 = null;
        picas10 = null;
        picasK = null;

        corazonAS = null;
        corazon3 = null;
        corazon10 = null;
        corazonJ = null;

        trebolAS = null;
        trebol3 = null;
        trebol10 = null;
        trebolK = null;
    }
}


