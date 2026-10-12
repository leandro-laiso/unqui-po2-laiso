package ar.edu.unq.po2.tpPatronStrategy;

public class EncriptadorNaive {

    // Atributos
    private Encriptador estrategiaEncriptado;

    // Constructores
    public EncriptadorNaive() {
        this.estrategiaEncriptado = new CambiarOrdenPalabras();
    }

    // Métodos
    public void setEncriptador(Encriptador encriptador) {
        this.estrategiaEncriptado = encriptador;
    }

    public String encriptar(String texto) {
        return this.estrategiaEncriptado.encriptar(texto);
    }

    public String desencriptar(String texto) {
        return this.estrategiaEncriptado.desencriptar(texto);
    }
}
