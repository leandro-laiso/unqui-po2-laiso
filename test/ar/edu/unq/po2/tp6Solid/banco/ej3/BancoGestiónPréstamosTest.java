package ar.edu.unq.po2.tp6Solid.banco.ej3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BancoGestiónPréstamosTest {

    // Definiciones
    private BancoGestiónPréstamos bancoGP;
    private Cliente clientePer1;
    private Cliente clientePer2;
    private Cliente clienteHip1;
    private Cliente clienteHip2;
    private SolicitudCrédito solPer1;
    private SolicitudCrédito solPer2;
    private SolicitudCrédito solHip1;
    private SolicitudCrédito solHip2;
    private PropiedadInmobiliaria propiedad1;
    private PropiedadInmobiliaria propiedad2;

    @BeforeEach
    public void setUp() {
        // BancoGestiónPréstamos
        bancoGP = new BancoGestiónPréstamos();

        // SolicitudCréditoPersonal - Cumple ambas condiciones para ser aceptable
        clientePer1 = new Cliente("Juan", "Perez", "Berazategui", 35, 2000.0);
        solPer1 = new SolicitudCréditoPersonal(clientePer1, 10000.0, 10);

        // SolicitudCréditoPersonal No cumple ninguna de las condiciones
        clientePer2 = new Cliente("Martín", "Martínez", "Quilmes", 30, 1100.0);
        solPer2 = new SolicitudCréditoPersonal(clientePer2, 5000.0, 4);

        // SolicitudCréditoHipotecario - La solicitud cumple todos los requisitos
        clienteHip1 = new Cliente("Juan", "Rodriguez", "Quilmes", 20, 3000.0);
        propiedad1 = new PropiedadInmobiliaria("Casa", "Capital Federal", 50000.0);
        solHip1 = new SolicitudCréditoHipotecario(clienteHip1, 10000.0, 10, propiedad1);

        // SolicitudCréditoHipotecario - La solicitud no cumple ninguno de los requisitos
        clienteHip2 = new Cliente("Carlos", "Perez", "Quilmes", 64, 3000.0);
        propiedad2 = new PropiedadInmobiliaria("Casa", "Capital Federal", 10000.0);
        solHip2 = new SolicitudCréditoHipotecario(clienteHip2, 24000.0, 12, propiedad2);

    }

    @AfterEach
    public void teardown() {
        bancoGP = null;
        clientePer1 = null;
        clientePer2 = null;
        clienteHip1 = null;
        clienteHip2 = null;
        solPer1 = null;
        solPer2 = null;
        solHip1 = null;
        solHip2 = null;
        propiedad1 = null;
        propiedad2 = null;
    }

    @Test
    public void testConstructor() {
        List<SolicitudCrédito> solicitudes = bancoGP.getSolicitudes();
        assertTrue(solicitudes.isEmpty());
    }

    @Test
    public void testRegistrarSolicitud() {
        bancoGP.registrarSolicitud(solPer1);
        List<SolicitudCrédito> solicitudes = bancoGP.getSolicitudes();

        assertFalse(solicitudes.isEmpty());
        assertEquals(1, solicitudes.size());
        assertSame(solicitudes.getFirst(), solPer1);
    }

    @Test
    public void testMontoTotalADesembolsar() {
        bancoGP.registrarSolicitud(solPer1); // Cumple, suma 10000.0
        bancoGP.registrarSolicitud(solPer2); // No cumple
        bancoGP.registrarSolicitud(solHip1); // Cumple, suma 10000.0
        bancoGP.registrarSolicitud(solHip2); // No cumple

        // El monto debe ser 20000.0
        double montoADesembolsar = bancoGP.montoTotalADesembolsar();
        assertEquals(20000.0, montoADesembolsar);
    }

}
