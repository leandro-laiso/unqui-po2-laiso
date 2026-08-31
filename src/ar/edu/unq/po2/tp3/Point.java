package ar.edu.unq.po2.tp3;

public class Point {

    private int x;
    private int y;

    public Point() {
        this.setXY(0, 0);
    }

    public Point(int x, int y) {
        this.setXY(x, y);
    }

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

    public Point add(Point p) {
        return new Point(this.getX() + p.getX(), this.getY() + p.getY());
    }

}
