package ar.edu.unq.po2.tpPatronTemplateMethodYAdapter.ej2;

public abstract class Empleado {

    // Atributos
    private final double porcentajeDescuentos;

    public Empleado(double porcentajeDescuentos) {
        this.porcentajeDescuentos = porcentajeDescuentos;
    }

    public final double sueldo() {
        return
            (
            this.sueldoHora() * this.horasTrabajadas()
            +
            this.sueldoBasico()
            +
            this.extra()
            )
            *
            (1 - porcentajeDescuentos / 100);
    }

    protected double sueldoHora() {
        return 0;
    }

    protected int horasTrabajadas() {
        return 0;
    }

    protected double sueldoBasico() {
        return 0;
    }

    protected double extra() {
        return 0;
    }

}
