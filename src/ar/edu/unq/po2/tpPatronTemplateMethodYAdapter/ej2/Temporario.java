package ar.edu.unq.po2.tpPatronTemplateMethodYAdapter.ej2;

public class Temporario extends Empleado {

    // Atributos
    private final double sueldoHora;
    private final int horasTrabajadas;
    private final double sueldoBasico;
    private final boolean poseeHijos;
    private final boolean estaCasado;

    // Constructor
    public Temporario (
            double porcentajeDescuentos,
            double sueldoHora,
            int horasTrabajadas,
            double sueldoBasico,
            boolean poseeHijos,
            boolean estaCasado
            ) {
        super(porcentajeDescuentos);
        this.sueldoHora = sueldoHora;
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoBasico = sueldoBasico;
        this.poseeHijos = poseeHijos;
        this.estaCasado = estaCasado;
    }

    @Override
    protected double sueldoHora() {
        return this.sueldoHora;
    }

    @Override
    protected int horasTrabajadas() {
        return this.horasTrabajadas;
    }

    @Override
    protected double sueldoBasico() {
        return this.sueldoBasico;
    }

    @Override
    protected double extra() {
        return (poseeHijos || estaCasado) ? 100 : super.extra();
    }
}
