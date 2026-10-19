package ar.edu.unq.po2.tpPatronComposite.ej2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MixtoTest {

    private Región soja;
    private Región trigo;
    private Región mixto1;
    private Región mixto2;
    private Región mixto3;

    @BeforeEach
    public void setUp() {
        soja   = new Soja();
        trigo  = new Trigo();

        // trigo: 600 / 4 = 150, soja: 1000 / 4 = 250
        mixto1 = new Mixto(soja, soja, trigo, trigo);

        // trigo: 300 / 4 (75) +  mixto1 / 4 (37.5) = 112.5, soja: 1000 / 4 (250) + mixto1 / 4 (62.5) = 312.5
        mixto2 = new Mixto(soja, trigo, soja, mixto1);

        // trigo: 600 / 4 (150) + mixto2 / 4 (28.125) = 178.125, soja: 500 / 4 (125) + mixto2 / 4 (78.125) = 203.125
        mixto3 = new Mixto(mixto2, trigo, soja, trigo);

    }

    /**
     * Se testean las ganancias anuales para una región con 4 subregiones puras de un cultivo.
     */
    @Test
    public void mixto1GananciaAnualTest() {
        // Exercise
        double resultadoSoja = mixto1.gananciaAnualSoja();
        double resultadoTrigo = mixto1.gananciaAnualTrigo();

        // Verify
        assertEquals(250.0, resultadoSoja);
        assertEquals(150.0, resultadoTrigo);
    }

    /**
     * Se testean las ganancias anuales para una región con 3 subregiones puras y 1 subregión subdividida que tiene 4 subregiones puras.
     */
    @Test
    public void mixto2GananciaAnualTest() {
        // Exercise
        double resultadoSoja = mixto2.gananciaAnualSoja();
        double resultadoTrigo = mixto2.gananciaAnualTrigo();

        // Verify
        assertEquals(312.5, resultadoSoja);
        assertEquals(112.5, resultadoTrigo);
    }

    /**
     * Se testean las ganancias anuales para una región con 3 subregiones puras, y 1 subregión subdividida que a su vez tiene 3 subregiones puras y 1 subregión subdividida en 4 subregiones puras.
     */
    @Test
    public void mixto3GananciaAnualTest() {
        // Exercise
        double resultadoSoja = mixto3.gananciaAnualSoja();
        double resultadoTrigo = mixto3.gananciaAnualTrigo();

        // Verify
        assertEquals(203.125, resultadoSoja);
        assertEquals(178.125, resultadoTrigo);
    }

}
