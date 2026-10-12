package ar.edu.unq.po2.tpPatronStrategy;

import java.util.List;

public class CodificacionNumeros implements Encriptador {

    private final List<Character> indices = List.of(' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

    @Override
    public String encriptar(String texto) {
        char[] letras = texto.toCharArray();
        StringBuilder resultado = new StringBuilder();
        int i = 0;
        for ( ; i < letras.length - 1; i++) {
            resultado.append(indices.indexOf(letras[i]));
            resultado.append(',');
        }
        resultado.append(indices.indexOf(letras[i]));
        return resultado.toString();
    }

    @Override
    public String desencriptar(String texto) {
        String[] numeros = texto.split(",");
        StringBuilder resultado = new StringBuilder();
        for (String n : numeros) {
            resultado.append(indices.get(Integer.parseInt(n)));
        }
        return resultado.toString();
    }
}
