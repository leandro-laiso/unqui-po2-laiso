package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

    private List<Integer> numbers = new ArrayList<Integer>();

    /**
     * Agrega un número al Counter
     * @param number el número a agregar.
     */
    public void addNumber(int number) {
        numbers.add(number);
    }

    /**
     * @return La cantidad de números pares existentes en el Counter
     */
    public int getEvenOccurrences() {
        int counter = 0;
        for (int n: numbers) {
            if (n % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @return La cantidad de números impares existentes en el Counter
     */
    public int getOddOccurrences() {
        int counter = 0;
        for (int n: numbers) {
            if (n % 2 == 1) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param x el número del que se verifica la cantidad de múltiplos
     * @return La cantidad de números que son múltiplos de x existentes en el Counter
     */
    public int getMultiplesOf(int x) {
        int counter = 0;
        for (int n: numbers) {
            if (n % x == 0) {
                counter++;
            }
        }
        return counter;
    }

}
