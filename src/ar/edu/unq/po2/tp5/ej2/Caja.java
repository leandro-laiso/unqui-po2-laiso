package ar.edu.unq.po2.tp5.ej2;

public class Caja {

    // Atributos
    private Double montoAPagar = 0.0;

    // Getters
    public Double getMontoAPagar() {
        return montoAPagar;
    }

    // Métodos
    public void registrarProducto(Producto producto) {
        montoAPagar += producto.getPrecio();
        producto.decrementarStock();
    }

}
