package ar.edu.unq.po2.tpPatronState.ej2;

public class Reproduciendo extends EstadoReproducción {

    public Reproduciendo(Reproductor reproductor) {
        super(reproductor);
    }

    public void play() throws OperacionInvalidaException {
        throw new OperacionInvalidaException("Ya se está reproduciendo una canción");
    }

    public void pause() throws OperacionInvalidaException {
        this.getReproductor().getCancion().pause();
        this.getReproductor().setEstado(new EnPausa(this.getReproductor()));
    }

    public void stop() {
        this.getReproductor().getCancion().stop();
        this.getReproductor().setEstado(new SelecciónCanciones(this.getReproductor()));
    }

}
