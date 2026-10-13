package ar.edu.unq.po2.tpPatronTemplateMethodYAdapter.ej2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasanteTest {

    @Test
    public void testPasante() {
        // Definiciones
        Pasante pasante = new Pasante(13.0, 40, 10);

        double sueldo = pasante.sueldo();

        assertEquals(348.0, sueldo);
    }

}
