package ar.edu.unq.po2.tp5.ej3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImpuestoTest {

    private Impuesto impuesto;
    private Agencia agencia;

    @BeforeEach
    public void setUp() {
        agencia = new ClaseQueImplementaAgencia();
        impuesto = new Impuesto(agencia, 4000.0);
    }

    @Test
    public void testConstructor() {
        assertEquals(4000.0, impuesto.getTasaServicio());
    }

    @Test
    public void testGetPrecio() {
        assertEquals(4000.0, impuesto.getPrecio());
    }

    @Test
    public void testProcesar() {
        assertDoesNotThrow(() -> {
            impuesto.procesar();
        });
    }

}
