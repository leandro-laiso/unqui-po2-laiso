package ar.edu.unq.po2.tp5.ej3;

public abstract class Factura implements Pagable {

    // Atributos
    private Agencia agenciaAsignada;

    // Setters
    public void setAgenciaAsignada(Agencia agenciaAsignada) {
        this.agenciaAsignada = agenciaAsignada;
    }

    // Métodos
    public abstract Double getPrecio();

    public void procesar() {
        agenciaAsignada.registrarPago(this);
    }

}
