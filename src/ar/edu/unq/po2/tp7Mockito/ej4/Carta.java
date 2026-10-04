package ar.edu.unq.po2.tp7Mockito.ej4;

import java.util.Objects;

import static java.util.EnumSet.range;

public class Carta {

    // Atributos
    String valor;
    String palo;

    // Constructor
    public Carta(String valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    // Getters
    public String getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }

    // Métodos
    public boolean esValorSuperior(Carta carta) {
        return this.getValorNumerico() > carta.getValorNumerico();
    }

    public int getValorNumerico() {
        String actual;
        int i;
        for (i = 1; i <= 10; i++) {
            actual = ""+i;
            if (actual.equals(this.getValor())) {
                break;
            }
        }
        return i;
    }

    public boolean esDelMismoPalo(Carta carta) {
        return this.getPalo().equals(carta.getPalo());
    }

}
