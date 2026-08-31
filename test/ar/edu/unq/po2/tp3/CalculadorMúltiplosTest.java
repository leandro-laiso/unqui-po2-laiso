package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorMúltiplosTest {

    private CalculadorMúltiplos calcuMult = new CalculadorMúltiplos();

    @Test
    public void multSimultaneoMasAltoTest() {

        // Con valores <= 0, no existe ningún número que verifique, devuelve -1
        assertEquals(-1, calcuMult.multSimultaneoMasAlto(0,2));
        assertEquals(-1, calcuMult.multSimultaneoMasAlto(10,0));
        assertEquals(-1, calcuMult.multSimultaneoMasAlto(0,0));

        // Con valores > 0, deberian dar un número entre 0 y 1000
        assertEquals(1000, calcuMult.multSimultaneoMasAlto(1, -1));
        assertEquals(999, calcuMult.multSimultaneoMasAlto(3, 9));
        assertEquals(996, calcuMult.multSimultaneoMasAlto(4, 6));
        assertEquals(1000, calcuMult.multSimultaneoMasAlto(5, 8));
        assertEquals(980, calcuMult.multSimultaneoMasAlto(7, 10));
        assertEquals(960, calcuMult.multSimultaneoMasAlto(12, 15));

        //Con valores > 0, pero deberian dar -1 porque no existe un número entre 0 y 1000 múltiplo de ambos
        assertEquals(-1, calcuMult.multSimultaneoMasAlto(500, 501));
        assertEquals(-1, calcuMult.multSimultaneoMasAlto(400, 401));
        assertEquals(-1, calcuMult.multSimultaneoMasAlto(333, 334));
        assertEquals(-1, calcuMult.multSimultaneoMasAlto(600, 700));
        assertEquals(-1, calcuMult.multSimultaneoMasAlto(800, 900));
    }
}
