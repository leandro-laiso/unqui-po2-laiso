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
        Double sumatoria = 0.0;
        for (IngresoPercibido i: ingresosPercibidos) {
            sumatoria += i.getMontoPercibido();
        }
        return sumatoria;
    }

    public Double getMontoImponible() {
        Double sumatoria = 0.0;
        for (IngresoPercibido i: ingresosPercibidos) {
            sumatoria += i.montoImponible();
        }
        return sumatoria;
    }

    public Double getImpuestoAPagar() {
        return this.getMontoImponible() * 0.02;
    }

}
