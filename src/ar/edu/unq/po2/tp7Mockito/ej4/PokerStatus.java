package ar.edu.unq.po2.tp7Mockito.ej4;

import java.util.*;
import java.util.stream.Collectors;

public class PokerStatus {

    public String verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {

        List<Carta>   cartas             = List.of(c1, c2, c3, c4, c5);

        int maxValor = cartas
                        .stream()
                        .collect(Collectors.groupingBy(Carta::getValor, Collectors.counting()))
                        .values()
                        .stream()
                        .mapToInt(Long::intValue)
                        .max()
                        .orElse(0);

        int maxPalo = cartas
                        .stream()
                        .collect(Collectors.groupingBy(Carta::getPalo, Collectors.counting()))
                        .values()
                        .stream()
                        .mapToInt(Long::intValue)
                        .max()
                        .orElse(0);

        if (maxValor == 4) {
            return "Poker";
        } else if (maxValor == 3) {
            return "Trio";
        } else if (maxPalo == 5) {
            return "Color";
        } else {
            return "Nada";
        }

    }

}
