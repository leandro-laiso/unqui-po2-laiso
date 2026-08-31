package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo {

    /**
     * Crea una nueva instancia de Cuadrado con los valores recibidos por parámetro.
     * @param esqSupIzq La ubicación de la esquina superior izquierda del Cuadrado.
     * @param tamaño El tamaño de cada lado del cuadrado.
     */
    public Cuadrado(Point esqSupIzq, int tamaño) {
        super(esqSupIzq, tamaño, tamaño);
    }

    public int getTamaño() {
        return super.getAltura();
    }

}
