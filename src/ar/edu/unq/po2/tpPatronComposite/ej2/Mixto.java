package ar.edu.unq.po2.tpPatronComposite.ej2;

import java.util.ArrayList;
import java.util.List;

public class Mixto extends Región {

    private final List<Región> subregiones; // 4 elementos

    public Mixto(Región sub1, Región sub2, Región sub3, Región sub4) {
        subregiones = new ArrayList<>();
        subregiones.add(sub1);
        subregiones.add(sub2);
        subregiones.add(sub3);
        subregiones.add(sub4);
    }

    @Override
    public double gananciaAnualSoja() {
        double resultado = 0;
        for (Región r : subregiones) {
            resultado += r.gananciaAnualSoja();
        }
        return (resultado / 4.0);
    }

    @Override
    public double gananciaAnualTrigo() {
        double resultado = 0;
        for (Región r : subregiones) {
            resultado += r.gananciaAnualTrigo();
        }
        return (resultado / 4.0);
    }

}
