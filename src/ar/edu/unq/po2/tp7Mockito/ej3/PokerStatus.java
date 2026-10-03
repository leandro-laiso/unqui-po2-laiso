package ar.edu.unq.po2.tp7Mockito.ej3;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PokerStatus {

    public String verificar(String c1, String c2, String c3, String c4, String c5) {
        List<String> cartas = List.of(c1, c2, c3, c4, c5);
        Map<String, Integer> valores = new HashMap<>();
        Map<String, Integer> palos = new HashMap<>();

        for (String carta : cartas) {
            valores.merge(this.obtenerValor(carta), 1, Integer::sum);
            palos.merge(this.obtenerPalo(carta), 1, Integer::sum);
        }

        int maxCartasDelMismoPalo  = Collections.max(palos.values());
        int maxCartasDelMismoValor = Collections.max(valores.values());

        if (maxCartasDelMismoValor == 4) {
            return "Poker";
        } else if (maxCartasDelMismoValor == 3) {
            return "Trio";
        } else if (maxCartasDelMismoPalo == 5) {
            return "Color";
        } else {
            return "Nada";
        }
    }

    private String obtenerValor(String carta) {
        String valor;

        if (carta.length() == 2) {
            valor = carta.substring(0, 1);
        } else { // carta.length() == 3
            valor = carta.substring(0, 2);
        }

        return valor;
    }

    private String obtenerPalo(String carta) {
        return carta.substring(carta.length() - 1);
    }

}
