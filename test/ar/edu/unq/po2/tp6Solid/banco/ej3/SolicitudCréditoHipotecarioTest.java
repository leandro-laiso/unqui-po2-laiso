package ar.edu.unq.po2.tp6Solid.banco.ej3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolicitudCréditoHipotecarioTest {

    private SolicitudCréditoHipotecario solicitudCumple;
    private SolicitudCréditoHipotecario solicitudNoCumple;
    private Cliente clienteCumple;
    private Cliente clienteNoCumple;
    private PropiedadInmobiliaria propiedadCumple;
    private PropiedadInmobiliaria propiedadNoCumple;

    @BeforeEach
    public void setUp() {
        // Caso en el que la solicitud cumple todos los requisitos
        clienteCumple = new Cliente("Juan", "Rodriguez", "Quilmes", 20, 3000.0);
        propiedadCumple = new PropiedadInmobiliaria("Casa", "Capital Federal", 50000.0);
        solicitudCumple = new SolicitudCréditoHipotecario(clienteCumple, 10000.0, 10, propiedadCumple);

        // Caso en el que la solicitud no cumple ninguno de los requisitos
        clienteNoCumple = new Cliente("Carlos", "Perez", "Quilmes", 64, 3000.0);
        propiedadNoCumple = new PropiedadInmobiliaria("Casa", "Capital Federal", 10000.0);
        solicitudNoCumple = new SolicitudCréditoHipotecario(clienteNoCumple, 24000.0, 12, propiedadNoCumple);
    }

    @AfterEach
    public void teardown() {
        clienteCumple = null;
        clienteNoCumple = null;
        propiedadCumple = null;
        propiedadNoCumple = null;
        solicitudCumple = null;
        solicitudNoCumple = null;
    }

    @Test
    public void testConstructor() {
        assertSame(clienteCumple, solicitudCumple.getSolicitante());
        assertEquals(10000.0, solicitudCumple.getMontoTotal());
        assertEquals(10, solicitudCumple.getPlazoEnMeses());
    }

    @Test
    public void testMontoMensual() {
        assertEquals(1000.0, solicitudCumple.montoMensual());
    }

    @Test
    public void testEsAceptable() {
        // Cumple los requisitos
        assertTrue(solicitudCumple.esAceptable());

        // No cumple los requisitos
        assertFalse(solicitudNoCumple.esAceptable());
    }
    
}
