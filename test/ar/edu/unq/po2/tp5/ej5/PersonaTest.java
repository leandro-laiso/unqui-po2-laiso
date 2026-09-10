package ar.edu.unq.po2.tp5.ej5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonaTest {

    Persona leandro, ulises;

    @BeforeEach
    public void setUp() {
        leandro = new Persona("Leandro", LocalDate.of(2005, 11, 30));
        ulises = new Persona("Ulises", LocalDate.of(2001, 8, 31));
    }

    @Test
    public void testConstructor() {
        assertEquals("Leandro", leandro.getNombre());
        assertEquals(LocalDate.of(2005,11,30), leandro.getFechaNacimiento());
        assertEquals("Ulises", ulises.getNombre());
        assertEquals(LocalDate.of(2001,8,31), ulises.getFechaNacimiento());
    }

    @Test
    public void testEdad() {
        assertEquals(20, leandro.edad());
        assertEquals(25, ulises.edad());
    }

    @Test
    public void testComparable() {
        assertEquals(-1, leandro.compareTo(ulises));
        assertEquals(1, ulises.compareTo(leandro));
    }

}
