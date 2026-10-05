package ar.edu.unq.po2.tp7Mockito.ej5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class PokerStatusTest {

    // El SUT es PokerStatus y su DOC es Carta
    // Se Mockearán las Cartas para testear de forma aislada el SUT PokerSTatus

    // Definiciones
    private PokerStatus poker;

    private Carta diamanteAS;
    private Carta diamante3;
    private Carta diamante4;
    private Carta diamante10;
    private Carta diamanteQ;

    private Carta picasAS;
    private Carta picasK;

    private Carta corazonAS;
    private Carta corazon3;
    private Carta corazon10;
    private Carta corazonJ;

    private Carta trebolAS;
    private Carta trebolK;

    @BeforeEach
    public void setUp() {
        // SETUP
        poker = new PokerStatus();

        // Mock Objects
        diamanteAS  = mock(Carta.class);
        diamante3   = mock(Carta.class);
        diamante4   = mock(Carta.class);
        diamante10  = mock(Carta.class);
        diamanteQ   = mock(Carta.class);

        picasAS     = mock(Carta.class);
        picasK      = mock(Carta.class);

        corazonAS   = mock(Carta.class);
        corazon3    = mock(Carta.class);
        corazon10   = mock(Carta.class);
        corazonJ    = mock(Carta.class);

        trebolAS    = mock(Carta.class);
        trebolK     = mock(Carta.class);



        // Test Doubles Configuration
        // Todos los Mock Objects son Stub (proporcionan respuestas pre-programadas a las llamadas
        // getValor() y getPrecio() requeridas por PokerStatus.verificar())

        // Diamante
        when(diamanteAS.getValor()).thenReturn(Valor.AS);
        when(diamanteAS.getPalo()).thenReturn("D");

        when(diamante3.getValor()).thenReturn(Valor.TRES);
        when(diamante3.getPalo()).thenReturn("D");

        when(diamante4.getValor()).thenReturn(Valor.CUATRO);
        when(diamante4.getPalo()).thenReturn("D");

        when(diamante10.getValor()).thenReturn(Valor.DIEZ);
        when(diamante10.getPalo()).thenReturn("D");

        when(diamanteQ.getValor()).thenReturn(Valor.Q);
        when(diamanteQ.getPalo()).thenReturn("D");

        // Picas
        when(picasAS.getValor()).thenReturn(Valor.AS);
        when(picasAS.getPalo()).thenReturn("P");

        when(picasK.getValor()).thenReturn(Valor.K);
        when(picasK.getPalo()).thenReturn("P");

        // Corazon
        when(corazonAS.getValor()).thenReturn(Valor.AS);
        when(corazonAS.getPalo()).thenReturn("C");

        when(corazon3.getValor()).thenReturn(Valor.TRES);
        when(corazon3.getPalo()).thenReturn("C");

        when(corazon10.getValor()).thenReturn(Valor.DIEZ);
        when(corazon10.getPalo()).thenReturn("C");

        when(corazonJ.getValor()).thenReturn(Valor.J);
        when(corazonJ.getPalo()).thenReturn("C");

        // Trébol
        when(trebolAS.getValor()).thenReturn(Valor.AS);
        when(trebolAS.getPalo()).thenReturn("T");

        when(trebolK.getValor()).thenReturn(Valor.K);
        when(trebolK.getPalo()).thenReturn("T");
    }

    @Test
    public void TestVerificarCasoCuatroCartasValor1() {
        // EXERCISE
        String resultado = poker.verificar(diamanteAS, picasAS, trebolAS, picasK, corazonAS);
        // Las cinco cartas son INPUTS DIRECTOS de PokerStatus ('poker').
        // Los valores que PokerStatus (SUT) obtiene mediante las llamadas Carta.getValor() y Carta.getPalo() son INPUTS INDIRECTOS para PokerStatus
        // Dichos inputs indirectos son controlados mediante when(unaCarta.getValor()).thenReturn(Valor.UNVALOR) (y lo mismo para el Palo) en los objetos Stub.
        // El string 'resultado' devuelto por poker.verificar(...) es un OUTPUT DIRECTO (resultado que el SUT devuelve directamente).
        // Un OUTPUT INDIRECTO sería cuando el SUT produce algún efecto observable sobre una dependencia (en este caso Carta), en este caso no ocurre.

        // VERIFY
        assertEquals("Poker", resultado);
    }

    @Test
    public void TestVerificarCasoTresCartasValor1DosValor10() {
        // EXERCISE
        String resultado = poker.verificar(picasAS, diamante10, corazon10, corazonAS, trebolAS);
        // Las cinco cartas son INPUTS DIRECTOS de PokerStatus ('poker').
        // Los valores que PokerStatus (SUT) obtiene mediante las llamadas Carta.getValor() y Carta.getPalo() son INPUTS INDIRECTOS para PokerStatus
        // Dichos inputs indirectos son controlados mediante when(unaCarta.getValor()).thenReturn(Valor.UNVALOR) (y lo mismo para el Palo) en los objetos Stub.
        // El string 'resultado' devuelto por poker.verificar(...) es un OUTPUT DIRECTO (resultado que el SUT devuelve directamente).
        // Un OUTPUT INDIRECTO sería cuando el SUT produce algún efecto observable sobre una dependencia (en este caso Carta), en este caso no ocurre.

        // VERIFY
        assertEquals("Trio", resultado);
    }

    @Test
    public void TestVerificarCasoCincoCartasDiamantes() {
        // EXERCISE
        String resultado = poker.verificar(diamanteAS, diamante10, diamante3, diamante4, diamanteQ);
        // Las cinco cartas son INPUTS DIRECTOS de PokerStatus ('poker').
        // Los valores que PokerStatus (SUT) obtiene mediante las llamadas Carta.getValor() y Carta.getPalo() son INPUTS INDIRECTOS para PokerStatus
        // Dichos inputs indirectos son controlados mediante when(unaCarta.getValor()).thenReturn(Valor.UNVALOR) (y lo mismo para el Palo) en los objetos Stub.
        // El string 'resultado' devuelto por poker.verificar(...) es un OUTPUT DIRECTO (resultado que el SUT devuelve directamente).
        // Un OUTPUT INDIRECTO sería cuando el SUT produce algún efecto observable sobre una dependencia (en este caso Carta), en este caso no ocurre.

        // VERIFY
        assertEquals("Color", resultado);
    }

    @Test
    public void TestVerificarCasoTodasCartasDistintas() {
        // EXERCISE
        String resultado = poker.verificar(picasAS, diamante4, corazon3, corazonJ, trebolK);
        // Las cinco cartas son INPUTS DIRECTOS de PokerStatus ('poker').
        // Los valores que PokerStatus (SUT) obtiene mediante las llamadas Carta.getValor() y Carta.getPalo() son INPUTS INDIRECTOS para PokerStatus
        // Dichos inputs indirectos son controlados mediante when(unaCarta.getValor()).thenReturn(Valor.UNVALOR) (y lo mismo para el Palo) en los objetos Stub.
        // El string 'resultado' devuelto por poker.verificar(...) es un OUTPUT DIRECTO (resultado que el SUT devuelve directamente).
        // Un OUTPUT INDIRECTO sería cuando el SUT produce algún efecto observable sobre una dependencia (en este caso Carta), en este caso no ocurre.

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
        picasK = null;

        corazonAS = null;
        corazon3 = null;
        corazon10 = null;
        corazonJ = null;

        trebolAS = null;
        trebolK = null;
    }
}


