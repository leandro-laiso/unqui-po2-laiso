package ar.edu.unq.po2.tpPatronTemplateMethodYAdapter.ej2;

public class Pasante extends Empleado {

    // Atributos
    private final double sueldoHora;
    private final int horasTrabajadas;

    // Constructor
    public Pasante(double porcentajeDescuentos, double sueldoHora, int horasTrabajadas) {
        super(porcentajeDescuentos);
        this.sueldoHora = sueldoHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    protected double sueldoHora() {
        return this.sueldoHora;
    }

    @Override
    protected int horasTrabajadas() {
        return this.horasTrabajadas;
    }

}
