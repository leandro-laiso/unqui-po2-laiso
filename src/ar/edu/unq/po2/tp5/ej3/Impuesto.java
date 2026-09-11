package ar.edu.unq.po2.tp5.ej3;

public class Impuesto extends Factura {

    // Atributos
    private Double tasaServicio;

    // Constructor
    public Impuesto(Agencia agenciaAsignada, Double tasaServicio) {
        this.setAgenciaAsignada(agenciaAsignada);
        this.setTasaServicio(tasaServicio);
    }

    // Getters & Setters
    public Double getTasaServicio() {
        return tasaServicio;
    }

    public void setTasaServicio(Double tasaServicio) {
        this.tasaServicio = tasaServicio;
    }

    // Métodos
    @Override
    public Double getPrecio() {
        return tasaServicio;
    }
}
