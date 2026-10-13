package ar.edu.unq.po2.tpPatronTemplateMethodYAdapter.ej2;

public class DePlanta extends Empleado {

    // Atributos
    private final double sueldoBasico;
    private final int cantHijos;

    // Constructor
    public DePlanta(double porcentajeDescuentos, double sueldoBasico, int cantHijos) {
        super(porcentajeDescuentos);
        this.sueldoBasico = sueldoBasico;
        this.cantHijos = cantHijos;
    }

    @Override
    protected double sueldoBasico() {
        return this.sueldoBasico;
    }

    @Override
    protected double extra() {
        return 150 * cantHijos;
    }

}
