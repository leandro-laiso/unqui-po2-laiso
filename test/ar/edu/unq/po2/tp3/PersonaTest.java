package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    private Persona p1 = new Persona("Leandro", LocalDate.of(2005, 11, 30));
    private Persona p2 = new Persona("Ulises", LocalDate.of(2001, 8, 31));

    @Test
    public void testConstructor() {
        assertEquals("Leandro", p1.getNombre());
        assertEquals(LocalDate.of(2005, 11, 30), p1.getFecNac());
        assertEquals("Ulises", p2.getNombre());
        assertEquals(LocalDate.of(2001, 8, 31), p2.getFecNac());

    }

    @Test
    public void testEdad() {
        assertEquals(20, p1.getEdad());
        assertEquals(25, p2.getEdad());
    }

    @Test
    public void testMenorQue() {
        assertTrue(p1.menorQue(p2));
        assertFalse(p2.menorQue(p1));
    }
}
