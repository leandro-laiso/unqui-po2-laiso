package ar.edu.unq.po2.tp3;

public class Point {

    // Atributos
    private int x;
    private int y;

    // Constructores

    /**
     * Crea una nueva instancia de Point inicializada con las coordenadas por defecto x = 0 e y = 0.
     */
    public Point() {
        this.setXY(0, 0);
    }

    /**
     * Crea una nueva instancia de point inicializada con las coordenadas recibidas por parámetro.
     * @param x
     * @param y
     */
    public Point(int x, int y) {
        this.setXY(x, y);
    }

    // Getters y Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    // Metodos

    /**
     *
     * @param p El Point a sumar
     * @return una nueva instancia de Point cuyas coordenadas resultan de sumar las coordenadas correspondientes del Point actual con las de p.
     */
    public Point add(Point p) {
        return new Point(this.getX() + p.getX(), this.getY() + p.getY());
    }

}
