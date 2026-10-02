package ar.edu.unq.po2.tp6Solid.banco.ej3;

public class PropiedadInmobiliaria {

    // Atributos
    private String descripción;
    private String dirección;
    private double valorFiscal;

    // Constructor
    public PropiedadInmobiliaria(String descripción, String dirección, double valorFiscal) {
        this.descripción = descripción;
        this.dirección = dirección;
        this.valorFiscal = valorFiscal;
    }

    // Getters
    public String getDescripción() {
        return descripción;
    }

    public String getDirección() {
        return dirección;
    }

    public double getValorFiscal() {
        return valorFiscal;
    }
}
