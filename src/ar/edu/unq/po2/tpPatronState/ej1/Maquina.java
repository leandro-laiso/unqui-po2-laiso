package ar.edu.unq.po2.tpPatronState.ej1;

public class Maquina {

    // Atributos
    private EstadoMaquina estado;

    // Constructor
    public Maquina() {
        this.estado = new SinFichas();
    }

    // Getters
    public EstadoMaquina getEstado() {
        return estado;
    }

    // Setters
    public void setEstado(EstadoMaquina estado) {
        this.estado = estado;
    }

    // Métodos
    public void inicio() {
        estado.inicio();
    }

    public void ingresarFicha() {
        estado.ingresarFicha(this);
    }

    public void finJuego() {
        this.setEstado(new SinFichas());
    }

}
