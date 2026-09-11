package ar.edu.unq.po2.tp5.ej3;

public class Caja {

    // Atributos
    private Double montoAPagar = 0.0;

    // Getters
    public Double getMontoAPagar() {
        return montoAPagar;
    }

    // Métodos
    public void registrarArtículo(Pagable pagable) {
        montoAPagar += pagable.getPrecio();
        pagable.procesar();
    }

}
