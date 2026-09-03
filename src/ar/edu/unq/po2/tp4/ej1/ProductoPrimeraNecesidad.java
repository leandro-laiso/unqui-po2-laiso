package ar.edu.unq.po2.tp4.ej1;

public class ProductoPrimeraNecesidad extends Producto {

    // Constructores
    public ProductoPrimeraNecesidad(String nombre, Double precio, boolean esPrecioCuidado) {
        super(nombre, precio, esPrecioCuidado);
    }

    public ProductoPrimeraNecesidad(String nombre, Double precio) {
        super(nombre, precio);
    }

    // Getters & Setters
    @Override
    public Double getPrecio() {
        return super.getPrecio() * 0.9;
    }

}
