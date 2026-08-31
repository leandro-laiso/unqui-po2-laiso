package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {

    /**
     *
     * @param numeros La lista de números a sumar
     * @return el resultado de la suma de todos los números de la lista
     */
    public int suma(ArrayList<Integer> numeros) {
        int resultadoAlMomento = 0;
        for (int n: numeros) {
            resultadoAlMomento += n;
        }
        return resultadoAlMomento;
    }

    /**
     *
     * @param numeros La lista de números a restar
     * @return el resultado de la resta de todos los números de la lista numeros
     */
    public int resta(ArrayList<Integer> numeros) {
        int resultadoAlMomento = numeros.isEmpty() ? 0 : numeros.removeFirst();
        for (int n: numeros) {
            resultadoAlMomento -= n;
        }
        return resultadoAlMomento;
    }

    /**
     *
     * @param numeros La lista de números a multiplicar entre sí
     * @return el resultado de multiplicar todos los números de la lista numeros entre sí.
     */
    public int multiplicación(ArrayList<Integer> numeros) {
        int resultadoAlMomento = numeros.isEmpty() ? 0 : 1;
        for (int n: numeros) {
            resultadoAlMomento *= n;
        }
        return resultadoAlMomento;
    }

}
