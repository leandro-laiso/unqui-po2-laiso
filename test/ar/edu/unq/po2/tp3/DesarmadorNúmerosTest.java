package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesarmadorNúmerosTest {

    private DesarmadorNúmeros desarmador = new DesarmadorNúmeros();

    @Test
    void mayorCantDigitosParesTest() {

        // Se crea la lista de enteros y se agregan los números.
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(0);			// 1
        listaNumeros.add(23);		    // 1
        listaNumeros.add(1876);		    // 2
        listaNumeros.add(8888);		    // 4
        listaNumeros.add(19862);		// 3
        listaNumeros.add(55552);	   	// 1
        listaNumeros.add(25525);	   	// 2
        listaNumeros.add(8256789);  	// 4

        // Se verifica que el número con la máxima cantidad de digitos pares es el indicado
        assertEquals(8888, desarmador.mayorCantDigitosPares(listaNumeros));

        // Se agrega un número y se verifica nuevamente
        listaNumeros.add(42137860); 	// 5
        assertEquals(42137860, desarmador.mayorCantDigitosPares(listaNumeros));

    }

    @Test
    void cantDigitosParesTest() {
        // Numeros positivos
        assertEquals(1, desarmador.cantDigitosPares(0));
        assertEquals(2, desarmador.cantDigitosPares(1876));
        assertEquals(1, desarmador.cantDigitosPares(23));
        assertEquals(4, desarmador.cantDigitosPares(8888));
        assertEquals(3, desarmador.cantDigitosPares(19862));
        assertEquals(1, desarmador.cantDigitosPares(55552));
        assertEquals(2, desarmador.cantDigitosPares(25525));
        assertEquals(4, desarmador.cantDigitosPares(8256789));
        assertEquals(5, desarmador.cantDigitosPares(42137860));
        assertEquals(3, desarmador.cantDigitosPares(5394128));

        // Numeros negativos
        assertEquals(2, desarmador.cantDigitosPares(-1876));
        assertEquals(1, desarmador.cantDigitosPares(-23));
        assertEquals(4, desarmador.cantDigitosPares(-8888));
        assertEquals(3, desarmador.cantDigitosPares(-19862));
        assertEquals(1, desarmador.cantDigitosPares(-55552));
        assertEquals(2, desarmador.cantDigitosPares(-25525));
        assertEquals(4, desarmador.cantDigitosPares(-8256789));
        assertEquals(5, desarmador.cantDigitosPares(-42137860));
        assertEquals(3, desarmador.cantDigitosPares(-5394128));
    }
}
