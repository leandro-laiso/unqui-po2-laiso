package ar.edu.unq.po2.tp6Solid.banco.ej3;

public class SolicitudCréditoHipotecario extends SolicitudCrédito {

    // Atributos
    private PropiedadInmobiliaria garantía;

    // Constructor
    public SolicitudCréditoHipotecario(Cliente solicitante, double montoTotal, int plazoEnMeses, PropiedadInmobiliaria garantía) {
        super(solicitante, montoTotal, plazoEnMeses);
        this.garantía = garantía;
    }

    // Métodos
    @Override
    public boolean esAceptable() {
        return (
            this.cumpleIngresosMensuales() &&
            this.cumpleValorFiscalGarantía() &&
            this.cumpleRequisitoEdad()
        );
    }

    private boolean cumpleIngresosMensuales() {
        return this.montoMensual() <= (this.getSolicitante().sueldoNetoMensual() * 0.50);
    }

    private boolean cumpleValorFiscalGarantía() {
        return this.getMontoTotal() <= (this.garantía.getValorFiscal() * 0.70);
    }

    private boolean cumpleRequisitoEdad() {
        return this.getSolicitante().getEdad() + (this.getPlazoEnMeses() / 12) < 65;
    }




}
