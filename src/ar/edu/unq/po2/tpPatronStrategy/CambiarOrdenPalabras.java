package ar.edu.unq.po2.tpPatronStrategy;

import java.util.Arrays;
import java.util.List;

public class CambiarOrdenPalabras implements Encriptador {

    @Override
    public String encriptar(String texto) {
        return this.invertirOrdenPalabras(texto);
    }

    @Override
    public String desencriptar(String texto) {
        return this.invertirOrdenPalabras(texto);
    }

    private String invertirOrdenPalabras(String texto) {
        StringBuilder resultado = new StringBuilder();
        List<String> palabras = Arrays.asList(texto.split(" "));
        resultado.append(palabras.getLast());
        for (int i = palabras.size() - 2; i >= 0; i--) {
            resultado.append(" ");
            resultado.append(palabras.get(i));
        }
        return resultado.toString();
    }
}
