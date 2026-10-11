package ar.edu.unq.po2.tpPatronState.ej2;

public class EnPausa extends EstadoReproducción {

    public EnPausa(Reproductor reproductor) {
        super(reproductor);
    }

    public void play() throws OperacionInvalidaException {
        throw new OperacionInvalidaException("Ya se está reproduciendo una canción");
    }

    public void pause() throws OperacionInvalidaException {
        this.getReproductor().getCancion().pause();
        this.getReproductor().setEstado(new Reproduciendo(this.getReproductor()));
    }

    public void stop() {
        this.getReproductor().getCancion().stop();
        this.getReproductor().setEstado(new SelecciónCanciones(this.getReproductor()));
    }

}

