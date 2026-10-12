package ar.edu.unq.po2.tpPatronStrategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CambiarVocales implements Encriptador {

    private final List<Character> vocales = List.of('a', 'e', 'i', 'o', 'u');

    @Override
    public String encriptar(String texto) {
        char[] letras = texto.toCharArray();
        StringBuilder resultado = new StringBuilder();
        for (char l : letras) {
            if (this.esVocal(l)) {
                resultado.append(this.siguienteVocal(l));
            } else {
                resultado.append(l);
            }
        }
        return resultado.toString();
    }

    @Override
    public String desencriptar(String texto) {
        char[] letras = texto.toCharArray();
        StringBuilder resultado = new StringBuilder();
        for (char l : letras) {
            if (this.esVocal(l)) {
                resultado.append(this.anteriorVocal(l));
            } else {
                resultado.append(l);
            }
        }
        return resultado.toString();
    }

    private boolean esVocal(char letra) {
        return vocales.contains(letra);
    }

    private char siguienteVocal(char letra) {
        if (vocales.contains(letra)) {
            return vocales.get(((vocales.indexOf(letra) + 1) % 5));
        } else {
            return letra;
        }
    }

    private char anteriorVocal(char letra) {
        if (vocales.contains(letra)) {
            return vocales.get(((vocales.indexOf(letra) + 4) % 5));
        } else {
            return letra;
        }
    }
}
