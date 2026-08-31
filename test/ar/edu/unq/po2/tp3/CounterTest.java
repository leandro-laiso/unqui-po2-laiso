package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTest {

    private Counter counter;

    /**
     * Crea un escenario de test básico, que consiste en un contador
     * con 10 enteros
     *
     * @throws Exception
     */
    @BeforeEach
    public void setUp() throws Exception {
        //Se crea el contador
        counter = new Counter();
        //Se agregan los numeros. Un solo par y nueve impares
        counter.addNumber(1);
        counter.addNumber(3);
        counter.addNumber(5);
        counter.addNumber(7);
        counter.addNumber(9);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(4);
    }

    /**
     * Verifica la cantidad de pares
     */
    @Test
    public void testEvenNumbers() {
        // Getting the even occurrences
        int amount = counter.getEvenOccurrences();
        // I check the amount is the expected one
        assertEquals(1, amount);
    }

    /**
     * Verifica la cantidad de impares
     */
    @Test
    public void testOddNumbers() {
        // Getting the odd occurrences
        int amount = counter.getOddOccurrences();
        // I check the amount is the expected one
        assertEquals(9, amount);
    }

    /**
     * Verifica la cantidad de multiplos de un cierto número
     */
    @Test
    public void testMultiples() {
        // Getting the multiples
        int multiplesOf1 = counter.getMultiplesOf(1);
        int multiplesOf2 = counter.getMultiplesOf(2);
        int multiplesOf3 = counter.getMultiplesOf(3);

        // Checking the amounts are the expected ones
        assertEquals(10, multiplesOf1);
        assertEquals(1, multiplesOf2);
        assertEquals(2, multiplesOf3);
    }
}