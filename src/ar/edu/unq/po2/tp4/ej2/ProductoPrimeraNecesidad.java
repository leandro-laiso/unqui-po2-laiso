package ar.edu.unq.po2.tp4.ej2;
import ar.edu.unq.po2.tp4.ej1.Producto;

public class ProductoPrimeraNecesidad extends Producto {

    // Atributos
    private int descuento;

    // Constructores
    public ProductoPrimeraNecesidad(String nombre, Double precio, int descuento, boolean esPrecioCuidado) {
        super(nombre, precio, esPrecioCuidado);
        this.descuento = descuento;
    }

    public ProductoPrimeraNecesidad(String nombre, Double precio, int descuento) {
        super(nombre, precio);
        this.descuento = descuento;
    }

    // Getters & Setters
    @Override
    public Double getPrecio() {
        return super.getPrecio() - (super.getPrecio() * descuento / 100);
    }

}
