package ar.edu.unq.po2.tp3;

public class Rectangulo {

    // Atributos
    private Point esqSupIzq;
    private int base;
    private int altura;

    // Constructores

    /**
     * Crea una nueva instancia de Rectangulo con la esquina superior izquierda por defecto (x = 0 e y = 0) y la base y altura recibidas por parámetro.
     * @param base La base del rectángulo
     * @param altura La altura del rectángulo
     */
    public Rectangulo(int base, int altura) {
        this.setEsqSupIzq(new Point());
        this.setBase(base);
        this.setAltura(altura);
    }

    /**
     * Crea una nueva instancia de Rectangulo con los valores recibidos por parámetro.
     * @param esqSupIzq La ubicación de la esquina superior izquierda del rectángulo
     * @param base La base del rectángulo
     * @param altura La altura del rectángulo
     */
    public Rectangulo(Point esqSupIzq, int base, int altura) {
        this.setEsqSupIzq(esqSupIzq);
        this.setBase(base);
        this.setAltura(altura);
    }

    // Métodos

    /**
     *
     * @return El área del rectángulo
     */
    public float area() {
        return this.getBase() * this.getAltura();
    }

    /**
     *
     * @return El perímetro del rectángulo
     */
    public float perimetro() {
        return (this.getBase() * 2) + (this.getAltura() * 2);
    }

    /**
     *
     * @return true si el rectángulo es vertical (más alto que ancho), false en caso contrario.
     */
    public boolean esVertical() {
        return this.getAltura() > this.getBase();
    }

    /**
     *
     * @return true si el rectángulo es horizontal (más ancho que alto), false en caso contrario.
     */
    public boolean esHorizontal() {
        return this.getBase() > this.getAltura();
    }

    // Getters & Setters
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public Point getEsqSupIzq() {
        return esqSupIzq;
    }

    public void setEsqSupIzq(Point esqSupIzq) {
        this.esqSupIzq = esqSupIzq;
    }

}
