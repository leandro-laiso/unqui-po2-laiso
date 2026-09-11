package ar.edu.unq.po2.tp5.ej3;

public class Producto implements Pagable {

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
    public void procesar() {
        this.decrementarStock();
    }

    public void decrementarStock() {
        stock--;
    }
}
