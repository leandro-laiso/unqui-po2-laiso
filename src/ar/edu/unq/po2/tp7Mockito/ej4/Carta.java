package ar.edu.unq.po2.tp7Mockito.ej4;

import java.util.Objects;

import static java.util.EnumSet.range;

public class Carta {

    // Atributos
    Valor valor;
    String palo;

    // Constructor
    public Carta(Valor valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    // Getters
    public Valor getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }

    // Métodos
    public boolean esValorSuperior(Carta carta) {
        return this.getValor().valorNumerico() > carta.getValor().valorNumerico();
    }

    public boolean esDelMismoPalo(Carta carta) {
        return this.getPalo().equals(carta.getPalo());
    }

}
