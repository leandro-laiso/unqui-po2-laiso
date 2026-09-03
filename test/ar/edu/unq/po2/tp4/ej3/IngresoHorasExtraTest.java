package ar.edu.unq.po2.tp4.ej3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngresoHorasExtraTest {

    private IngresoHorasExtra ingreso1;

    @BeforeEach
    public void setUp() {
        ingreso1 = new IngresoHorasExtra(Month.APRIL, "Horas extra", 5000.0, 20);
    }

    @Test
    public void testMontoImponible() {
        assertEquals(0.0, ingreso1.montoImponible());
    }


}
