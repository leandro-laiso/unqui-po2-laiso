package ar.edu.unq.po2.tp5.ej3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicioTest {

    private Servicio serv;
    private Agencia agencia;

    @BeforeEach
    public void setUp() {
        agencia = new ClaseQueImplementaAgencia();
        serv = new Servicio(agencia, 1250.0, 4);
    }

    @Test
    public void testConstructor() {
        assertEquals(1250.0, serv.getCostoPorUnidad());
        assertEquals(4, serv.getUnidadesConsumidas());
    }

    @Test
    public void testGetPrecio() {
        assertEquals(5000.0, serv.getPrecio());
    }

    @Test
    public void testProcesar() {
        assertDoesNotThrow(() -> {
            serv.procesar();
        });
    }

}
