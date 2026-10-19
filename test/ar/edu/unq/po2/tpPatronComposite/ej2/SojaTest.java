package ar.edu.unq.po2.tpPatronComposite.ej2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SojaTest {

    private Región soja;

    @BeforeEach
    public void setUp() {
        soja = new Soja();
    }

    @Test
    public void sojaGananciaAnualSojaTest() {
        // Exercise
        double resultadoSoja  = soja.gananciaAnualSoja();

        // Verify
        assertEquals(500, resultadoSoja);
    }

    @Test
    public void sojaGananciaAnualTrigoTest() {
        // Exercise
        double resultadoTrigo = soja.gananciaAnualTrigo();

        // Verify
        assertEquals(0, resultadoTrigo);
    }

}
