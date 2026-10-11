package ar.edu.unq.po2.tpPatronState.ej2;

public class Reproductor {

    private EstadoReproducción estado;
    private Song cancionAct;

    public Reproductor() {
        this.estado = new SelecciónCanciones(this);
        this.cancionAct = new Song();
    }

    public Song getCancion() {
        return cancionAct;
    }

    public EstadoReproducción getEstado() {
        return estado;
    }

    public void setEstado(EstadoReproducción estado) {
        this.estado = estado;
    }

    public void play() throws OperacionInvalidaException {
        estado.play();
    }

    public void pause() throws OperacionInvalidaException {
        estado.pause();
    }

    public void stop() {
        estado.stop();
    }

}
