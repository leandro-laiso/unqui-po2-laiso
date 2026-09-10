package ar.edu.unq.po2.tp5.ej5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MascotaTest {

    private Mascota perro;

    @BeforeEach
    public void setUp() {
        perro = new Mascota("Keke", "Perro");
    }

    @Test
    public void testConstructor() {
        assertEquals("Keke", perro.getNombre());
        assertEquals("Perro", perro.getRaza());
    }

}
