package ar.edu.unq.po2.tp7Mockito.ej2;

import java.util.*;

public class PokerStatus {

    public boolean verificar(String c1, String c2, String c3, String c4, String c5) {
        List<String> cartas = List.of(c1, c2, c3, c4, c5);
        Map<String, Integer> valores = new HashMap<>();

        String valorActual;
        for (String carta : cartas) {
            if (carta.length() == 2) {
                valorActual = carta.substring(0, 1);
            } else { // carta.length() == 3
                valorActual = carta.substring(0, 2);
            }
            valores.merge(valorActual, 1, Integer::sum);
        }

        return (Collections.max(valores.values())) == 4;
    }

}
