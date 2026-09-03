package ar.edu.unq.po2.tp4.ej3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngresoPercibidoTest {

    private IngresoPercibido ingreso1;

    @BeforeEach
    public void setUp() {
        ingreso1 = new IngresoPercibido(Month.AUGUST, "Horas trabajadas", 25600.0);
    }

    @Test
    public void testConstructor() {
        assertEquals(25600.0, ingreso1.getMontoPercibido());
    }

    @Test
    public void testMontoImponible() {
        assertEquals(25600.0, ingreso1.montoImponible());
    }

}
