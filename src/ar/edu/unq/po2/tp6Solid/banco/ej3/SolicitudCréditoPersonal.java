package ar.edu.unq.po2.tp6Solid.banco.ej3;

public class SolicitudCréditoPersonal extends SolicitudCrédito {

    // Constructor
    public SolicitudCréditoPersonal(Cliente solicitante, double montoTotal, int plazoEnMeses) {
        super(solicitante, montoTotal, plazoEnMeses);
    }

    // Métodos
    @Override
    public boolean esAceptable() {
        return this.cumpleIngresosAnuales() && this.cumpleIngresosMensuales();
    }

    private boolean cumpleIngresosAnuales() {
        return this.getSolicitante().sueldoNetoAnual() >= 15000.0;
    }

    private boolean cumpleIngresosMensuales() {
        return this.montoMensual() <= (this.getSolicitante().sueldoNetoMensual() * 0.70);
    }

}
