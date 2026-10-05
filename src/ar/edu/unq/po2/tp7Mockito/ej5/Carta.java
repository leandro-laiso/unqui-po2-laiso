package ar.edu.unq.po2.tp7Mockito.ej5;

import java.util.Objects;

import static java.util.EnumSet.range;

public interface Carta {
    // Solo defino el contrato de Carta que necesita PokerStatus para poder funcionar.
    public Valor getValor();
    public String getPalo();
}