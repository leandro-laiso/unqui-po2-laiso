package ar.edu.unq.po2.tp5.ej2;

public class Producto {

    // Atributos
    private Double precioBase;
    private int stock;

    // Constructor
    public Producto(Double precioBase, int stock) {
        this.precioBase = precioBase;
        this.stock = stock;
    }

    // Getters
    public Double getPrecio() {
        return precioBase;
    }

    public int getStock() {
        return stock;
    }

    // Métodos
    public void decrementarStock() {
        stock--;
    }
}
