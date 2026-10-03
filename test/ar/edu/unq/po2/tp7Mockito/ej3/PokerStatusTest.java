package ar.edu.unq.po2.tp7Mockito.ej3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PokerStatusTest {

    // Definiciones
    private PokerStatus poker = new PokerStatus();

    private String diamante1;
    private String diamante3;
    private String diamante4;
    private String diamante10;
    private String diamanteQ;

    private String picas1;
    private String picas3;
    private String picas10;
    private String picasK;

    private String corazon1;
    private String corazon3;
    private String corazon10;
    private String corazonJ;

    private String trebol1;
    private String trebol3;
    private String trebol10;
    private String trebolK;


    // SETUP
    @BeforeEach
    public void setUp() {
        // P = picas, C = corazones, D = diamantes, T = tréboles
        diamante1 = "1D";
        diamante3 = "3D";
        diamante4 = "4D";
        diamante10 = "10D";
        diamanteQ = "QD";

        picas1 = "1P";
        picas3 = "3P";
        picas10 = "10P";
        picasK = "KP";

        corazon1 = "1C";
        corazon3 = "3C";
        corazon10 = "10C";
        corazonJ = "JC";

        trebol1 = "1T";
        trebol3 = "3T";
        trebol10 = "10T";
        trebolK = "KT";
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


