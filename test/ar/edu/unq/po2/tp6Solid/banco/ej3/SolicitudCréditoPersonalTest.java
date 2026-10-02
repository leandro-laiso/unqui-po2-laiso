package ar.edu.unq.po2.tp6Solid.banco.ej3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolicitudCréditoPersonalTest {

    private SolicitudCréditoPersonal solicitud1;
    private SolicitudCréditoPersonal solicitud2;
    private SolicitudCréditoPersonal solicitud3;
    private SolicitudCréditoPersonal solicitud4;
    private Cliente cliente1;
    private Cliente cliente2;
    private Cliente cliente3;
    private Cliente cliente4;

    @BeforeEach
    public void setUp() {

        // Cumple ambas condiciones para ser aceptable
        cliente1 = new Cliente("Juan", "Perez", "Berazategui", 35, 2000.0);
        solicitud1 = new SolicitudCréditoPersonal(cliente1, 10000.0, 10);

        // Cumple una de las condiciones (ingresos anuales de al menos 15000)
        cliente2 = new Cliente("Carlos", "Rodriguez", "La Matanza", 43, 2000.0);
        solicitud2 = new SolicitudCréditoPersonal(cliente2, 10000.0, 5);

        // Cumple una de las condiciones (monto de la cuota no supera el 70% de sus ingresos mensuales)
        cliente3 = new Cliente("Miguel", "Cisneros", "Wilde", 50, 1000.0);
        solicitud3 = new SolicitudCréditoPersonal(cliente3, 1000.0, 5);

        // No cumple ninguna de las condiciones
        cliente4 = new Cliente("Martín", "Martínez", "Quilmes", 30, 1100.0);
        solicitud4 = new SolicitudCréditoPersonal(cliente4, 5000.0, 4);

    }

    @AfterEach
    public void teardown() {
        solicitud1 = null;
        solicitud2 = null;
        solicitud3 = null;
        solicitud4 = null;
        cliente1 = null;
        cliente2 = null;
        cliente3 = null;
        cliente4 = null;
    }

    @Test
    public void testConstructor() {
        assertSame(cliente1, solicitud1.getSolicitante());
        assertEquals(10000.0, solicitud1.getMontoTotal());
        assertEquals(10, solicitud1.getPlazoEnMeses());
    }

    @Test
    public void testMontoMensual() {
        assertEquals(1000.0, solicitud1.montoMensual());
    }

    @Test
    public void testEsAceptable() {
        // Se cumplen ambas condiciones para que la solicitud sea aceptable
        assertTrue(solicitud1.esAceptable());

        // Se cumple una de las condiciones (ingresos anuales de al menos 15000)
        assertFalse(solicitud2.esAceptable());

        // Se cumple una de las condiciones (monto de la cuota no supera el 70% de sus ingresos mensuales)
        assertFalse(solicitud3.esAceptable());

        // No se cumple ninguna de las condiciones
        assertFalse(solicitud4.esAceptable());
    }

}

