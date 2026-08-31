package ar.edu.unq.po2.tp3;

import java.util.List;

public class DesarmadorNúmeros {

    /**
     * @param numeros una lista de números enteros
     * @return el número de la lista numeros que tenga la mayor cantidad de digitos pares. En caso de que haya más de uno con la misma cantidad de digitos pares, retorna el primero que haya sido encontrado.
     */
    public int mayorCantDigitosPares(List<Integer> numeros) {
        int maxAlMomento = numeros.removeFirst();
        for (int n: numeros) {
            if (cantDigitosPares(n) > cantDigitosPares(maxAlMomento)) {
                maxAlMomento = n;
            }
        }
        return maxAlMomento;
    }

    /**
     * @param numero el numero entero del que se verifica la cantidad de digitos pares
     * @return la cantidad de digitos pares del numero recibido por parámetro.
     */
    protected int cantDigitosPares(int numero) {
        int cantDigitosPares = (numero == 0) ? 1 : 0;
        for ( ;numero != 0; numero /= 10) {
            if (numero % 2 == 0) {
                cantDigitosPares++;
            }
        }
        return cantDigitosPares;
    }

}
