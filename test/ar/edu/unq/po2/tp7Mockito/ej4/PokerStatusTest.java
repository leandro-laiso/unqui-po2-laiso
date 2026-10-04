package ar.edu.unq.po2.tp7Mockito.ej4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokerStatusTest {

    // Definiciones
    private PokerStatus poker = new PokerStatus();

    private Carta diamante1;
    private Carta diamante3;
    private Carta diamante4;
    private Carta diamante10;
    private Carta diamanteQ;

    private Carta picas1;
    private Carta picas3;
    private Carta picas10;
    private Carta picasK;

    private Carta corazon1;
    private Carta corazon3;
    private Carta corazon10;
    private Carta corazonJ;

    private Carta trebol1;
    private Carta trebol3;
    private Carta trebol10;
    private Carta trebolK;


    // SETUP
    @BeforeEach
    public void setUp() {
        // P = picas, C = corazones, D = diamantes, T = tréboles
        diamante1   = new Carta("1", "D");
        diamante3   = new Carta("3", "D");
        diamante4   = new Carta("4", "D");
        diamante10  = new Carta("10", "D");
        diamanteQ   = new Carta("Q", "D");

        picas1      = new Carta("1", "P");
        picas3      = new Carta("3", "P");
        picas10     = new Carta("10", "P");
        picasK      = new Carta("K", "P");

        corazon1    = new Carta("1", "C");
        corazon3    = new Carta("3", "C");
        corazon10   = new Carta("10", "C");
        corazonJ    = new Carta("J", "C");

        trebol1     = new Carta("1", "T");
        trebol3     = new Carta("3", "T");
        trebol10    = new Carta("10", "T");
        trebolK     = new Carta("K", "T");
    }

    @Test
    public void TestVerificarCasoCuatroCartasValor1() {
        // EXERCISE
        String resultado = poker.verificar(diamante1, picas1, trebol1, picasK, corazon1);

        // VERIFY
        assertEquals("Poker", resultado);
    }

    @Test
    public void TestVerificarCasoTresCartasValor1DosValor10() {
        // EXERCISE
        String resultado = poker.verificar(picas1, diamante10, corazon10, corazon1, trebol1);

        // VERIFY
        assertEquals("Trio", resultado);
    }

    @Test
    public void TestVerificarCasoCincoCartasDiamantes() {
        // EXERCISE
        String resultado = poker.verificar(diamante1, diamante10, diamante3, diamante4, diamanteQ);

        // VERIFY
        assertEquals("Color", resultado);
    }

    @Test
    public void TestVerificarCasoTodasCartasDistintas() {
        // EXERCISE
        String resultado = poker.verificar(picas1, diamante4, corazon3, corazonJ, trebolK);

        // VERIFY
        assertEquals("Nada", resultado);
    }


    // TEARDOWN
    @AfterEach
    public void teardown() {
        diamante1 = null;
        diamante3 = null;
        diamante4 = null;
        diamante10 = null;
        diamanteQ = null;

        picas1 = null;
        picas3 = null;
        picas10 = null;
        picasK = null;

        corazon1 = null;
        corazon3 = null;
        corazon10 = null;
        corazonJ = null;

        trebol1 = null;
        trebol3 = null;
        trebol10 = null;
        trebolK = null;
    }
}


