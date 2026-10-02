package ar.edu.unq.po2.tp6Solid.banco.ej3;

public abstract class SolicitudCrédito {

    // Atributos
    private Cliente solicitante;
    private double montoTotal;
    private int plazoEnMeses;

    // Constructor
    protected SolicitudCrédito(Cliente solicitante, double montoTotal, int plazoEnMeses) {
        this.solicitante = solicitante;
        this.montoTotal = montoTotal;
        this.plazoEnMeses = plazoEnMeses;
    }

    // Getters
    public Cliente getSolicitante() {
        return solicitante;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public int getPlazoEnMeses() {
        return plazoEnMeses;
    }

    // Métodos
    public double montoMensual() {
        return montoTotal / plazoEnMeses;
    }

    public abstract boolean esAceptable();

}
