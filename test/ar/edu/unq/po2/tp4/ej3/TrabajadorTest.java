package ar.edu.unq.po2.tp4.ej3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrabajadorTest {

    // Defino las variables
    private Trabajador trabajador;
    private IngresoPercibido ingresoEne1;
    private IngresoPercibido ingresoEne2;
    private IngresoPercibido ingresoFeb;
    private IngresoPercibido ingresoMar;
    private IngresoPercibido ingresoAbr;
    private IngresoHorasExtra ingresoFebHE;
    private IngresoHorasExtra ingresoAbrHE;

    @BeforeEach
    public void setUp() {
        ingresoEne1 = new IngresoPercibido(Month.JANUARY, "Horas trabajadas", 20000.0d);
        ingresoEne2 = new IngresoPercibido(Month.JANUARY, "Bonificaciones", 2500.0d);
        ingresoFeb =  new IngresoPercibido(Month.FEBRUARY, "Horas trabajadas", 25000.0d);
        ingresoMar =  new IngresoPercibido(Month.of(3), "Horas trabajadas", 30000.0d);
        ingresoAbr =  new IngresoPercibido(Month.of(4), "Horas trabajadas", 24000.0d);
        ingresoFebHE = new IngresoHorasExtra(Month.FEBRUARY, "Horas extra", 2000.0d, 5);
        ingresoAbrHE = new IngresoHorasExtra(Month.APRIL, "Horas extra", 400.0d, 1);

        // Se crea el trabajador y se le agregan los ingresos
        trabajador = new Trabajador();
        trabajador.agregarIngreso(ingresoEne1);
        trabajador.agregarIngreso(ingresoEne2);
        trabajador.agregarIngreso(ingresoFeb);
        trabajador.agregarIngreso(ingresoMar);
        trabajador.agregarIngreso(ingresoAbr);
        trabajador.agregarIngreso(ingresoFebHE);
        trabajador.agregarIngreso(ingresoAbrHE);
    }

    @Test
    public void testGetTotalPercibido() {
        assertEquals(103900.0d, trabajador.getTotalPercibido());
    }

    @Test
    public void testGetMontoImponible() {
        assertEquals(101500.0d, trabajador.getMontoImponible());
    }

    @Test
    public void testImpuestoAPagar() {
        assertEquals(2030.0d, trabajador.getImpuestoAPagar());
    }

}
