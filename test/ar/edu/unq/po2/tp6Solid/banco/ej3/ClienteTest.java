package ar.edu.unq.po2.tp6Solid.banco.ej3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    private Cliente leandro;

    @BeforeEach
    public void setUp() {
        leandro = new Cliente("Leandro", "Laiso", "Quilmes", 20, 1000.0);
    }

    @AfterEach
    public void teardown() {
        leandro = null;
    }

    @Test
    public void testConstructor() {
        assertEquals("Leandro", leandro.getNombre());
        assertEquals("Laiso", leandro.getApellido());
        assertEquals("Quilmes", leandro.getDirección());
        assertEquals(20, leandro.getEdad());
        assertEquals(1000.0, leandro.sueldoNetoMensual());
    }

    @Test
    public void testSueldoNetoAnual() {
        double sueldoNetoAnual = leandro.sueldoNetoAnual();

        assertEquals(12000.0, sueldoNetoAnual);
    }

}
