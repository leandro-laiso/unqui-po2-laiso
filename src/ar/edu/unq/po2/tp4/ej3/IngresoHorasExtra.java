package ar.edu.unq.po2.tp4.ej3;

import java.time.Month;

public class IngresoHorasExtra extends IngresoPercibido {

    // Atributos
    private int cantHorasExtra;

    // Constructor
    public IngresoHorasExtra(Month mes, String concepto, Double montoPercibido, int cantHorasExtra) {
        super(mes, concepto, montoPercibido);
        this.cantHorasExtra = cantHorasExtra;
    }

    // Métodos
    @Override
    public Double montoImponible() {
        return 0.0;
    }

}
