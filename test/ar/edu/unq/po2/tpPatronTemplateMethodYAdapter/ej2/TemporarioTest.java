package ar.edu.unq.po2.tpPatronTemplateMethodYAdapter.ej2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemporarioTest {

    @Test
    public void estaCasadoConHijos() {
        // Definiciones
        Temporario temp1 = new Temporario(13.0, 5, 10, 1000, true, true);

        double sueldo = temp1.sueldo();

        assertEquals(1000.5, sueldo);
    }

    @Test
    public void estaCasadoSinHijos() {
        Temporario temp2 = new Temporario(13.0, 5, 10, 1000, false, true);

        double sueldo = temp2.sueldo();

        assertEquals(1000.5, sueldo);
    }

    @Test
    public void noEstaCasadoYNoTieneHijos() {
        Temporario temp3 = new Temporario(13.0, 5, 10, 1000, false, false);

        double sueldo = temp3.sueldo();

        assertEquals(913.5, sueldo);
    }
}
