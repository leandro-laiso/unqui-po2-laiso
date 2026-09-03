package ar.edu.unq.po2.tp4.ej3;

import java.time.Month;

public class IngresoPercibido {

    // Atributos
    private Month mes;
    private String concepto;
    private Double montoPercibido;

    // Constructor
    public IngresoPercibido(Month mes, String concepto, Double montoPercibido) {
        this.mes = mes;
        this.concepto = concepto;
        this.montoPercibido = montoPercibido;
    }

    // Getters & Setters
    public Double getMontoPercibido() {
        return montoPercibido;
    }

    // Métodos
    public Double montoImponible() {
        return this.getMontoPercibido();
    }

}
