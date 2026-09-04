package ar.edu.unq.po2.tp4.ej3;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

    // Atributos
    private List<IngresoPercibido> ingresosPercibidos;

    // Constructores
    public Trabajador() {
        ingresosPercibidos = new ArrayList<IngresoPercibido>();
    }

    // Métodos
    public void agregarIngreso(IngresoPercibido ingreso) {
        ingresosPercibidos.add(ingreso);
    }

    public Double getTotalPercibido() {
        return ingresosPercibidos.stream().mapToDouble(ing -> ing.getMontoPercibido()).sum();
    }

    public Double getMontoImponible() {
        return ingresosPercibidos.stream().mapToDouble(ing -> ing.montoImponible()).sum();
    }

    public Double getImpuestoAPagar() {
        return this.getMontoImponible() * 0.02;
    }

}
