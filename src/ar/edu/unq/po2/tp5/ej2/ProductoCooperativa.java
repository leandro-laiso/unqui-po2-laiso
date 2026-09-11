package ar.edu.unq.po2.tp5.ej2;

public class ProductoCooperativa extends Producto {

    // Constructor
    public ProductoCooperativa(Double precioBase, int stock) {
        super(precioBase, stock);
    }

    // Getters
    @Override
    public Double getPrecio() {
        return super.getPrecio() * 0.90; // 10% de Descuento
    }

}
