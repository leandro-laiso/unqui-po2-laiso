package ar.edu.unq.po2.tpPatronComposite.ej2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrigoTest {

    private Región trigo;

    @BeforeEach
    public void setUp() {
        trigo = new Trigo();
    }

    @Test
    public void gananciaAnualSojaTest() {
        // Exercise
        double resultadoTrigo  = trigo.gananciaAnualTrigo();

        // Verify
        assertEquals(300, resultadoTrigo);
    }

    @Test
    public void gananciaAnualTrigoTest() {
        // Exercise
        double resultadoSoja = trigo.gananciaAnualSoja();

        // Verify
        assertEquals(0, resultadoSoja);
    }

}
