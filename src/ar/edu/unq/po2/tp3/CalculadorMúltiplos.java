package ar.edu.unq.po2.tp3;

public class CalculadorMúltiplos {

    /**
     * @param x
     * @param y
     * @return el número más alto entre 0 y 1000 que sea múltiplo simultáneamente de x e y. Si no existe, retorna -1.
     */
    public int multSimultaneoMasAlto(int x, int y) {
        int i = 1000;
        for (; i > 0 && !(esMultiplo(i, x) && esMultiplo(i, y)); i--) { }
        return i == 0 ? -1 : i;
    }

    /**
     * @param numero
     * @param divisor
     * @return true si numero es múltiplo de divisor, false en caso contrario. Si el divisor es 0, devuelve false.
     */
    public boolean esMultiplo(int numero, int divisor) {
        return divisor != 0 && numero % divisor == 0;
    }

}
