package ar.edu.unq.po2.tp5.ej3;

public class Servicio extends Factura {

    // Atributos
    private Double costoPorUnidad;
    private int unidadesConsumidas;

    // Constructor
    public Servicio(Agencia agenciaAsignada, Double costoPorUnidad, int unidadesConsumidas) {
        this.setAgenciaAsignada(agenciaAsignada);
        this.setCostoPorUnidad(costoPorUnidad);
        this.setUnidadesConsumidas(unidadesConsumidas);
    }

    // Getters & Setters
    public Double getCostoPorUnidad() {
        return costoPorUnidad;
    }

    public int getUnidadesConsumidas() {
        return unidadesConsumidas;
    }

    public void setCostoPorUnidad(Double costoPorUnidad) {
        this.costoPorUnidad = costoPorUnidad;
    }

    public void setUnidadesConsumidas(int unidadesConsumidas) {
        this.unidadesConsumidas = unidadesConsumidas;
    }

    // Métodos
    public Double getPrecio() {
        return costoPorUnidad * unidadesConsumidas;
    }

}
