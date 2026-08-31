package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultioperadorTest {

    private Multioperador multiop = new Multioperador();
    private ArrayList<Integer> numeros = new ArrayList<>();
    private ArrayList<Integer> listaVacia = new ArrayList<>();

    @BeforeEach
    public void setUp() {

        // Se introducen números en la lista
        numeros.add(22);
        numeros.add(345);
        numeros.add(1);
        numeros.add(-87);
        numeros.add(-12);

    }

    @Test
    void suma() {

        // Se obtienen los resultados de la suma
        int resultado1 = multiop.suma(numeros);
        int resultado2 = multiop.suma(listaVacia);

        // Se verifica que los resultados sean los esperados
        assertEquals(269, resultado1);
        assertEquals(0, resultado2);

    }

    @Test
    void resta() {

        // Se obtienen los resultados de la resta
        int resultado1 = multiop.resta(numeros);
        int resultado2 = multiop.resta(listaVacia);

        // Se verifica que los resultados sean los esperados
        assertEquals(-225, resultado1);
        assertEquals(0, resultado2);

    }

    @Test
    void multiplicación() {

        // Se obtienen los resultados de la multiplicación
        int resultado1 = multiop.multiplicación(numeros);
        int resultado2 = multiop.multiplicación(listaVacia);

        // Se verifica que los resultados sean los esperados
        assertEquals(7923960, resultado1);
        assertEquals(0, resultado2);

    }
}
