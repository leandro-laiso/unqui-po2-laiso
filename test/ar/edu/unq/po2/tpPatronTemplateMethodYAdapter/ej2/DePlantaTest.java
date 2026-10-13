package ar.edu.unq.po2.tpPatronTemplateMethodYAdapter.ej2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DePlantaTest {

    @Test
    public void testDePlantaSinHijos() {
        DePlanta sinHijos = new DePlanta(13.0, 3000, 0);

        double sueldo = sinHijos.sueldo();

        assertEquals(2610.0, sueldo);
    }

    @Test
    public void testDePlantaUnHijo() {
        DePlanta unHijo = new DePlanta(13.0, 3000, 1);

        double sueldo = unHijo.sueldo();

        assertEquals(2740.5, sueldo);
    }

    @Test
    public void testDePlantaCincoHijos() {
        DePlanta cincoHijos = new DePlanta(13.0, 3000, 5);

        double sueldo = cincoHijos.sueldo();

        assertEquals(3262.5, sueldo);
    }

}
