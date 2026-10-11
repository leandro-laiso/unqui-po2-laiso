package ar.edu.unq.po2.tpPatronState.ej2;

public abstract class EstadoReproducción {

    private Reproductor reproductor;

    public EstadoReproducción(Reproductor reproductor) {
        this.reproductor = reproductor;
    }

    protected Reproductor getReproductor() {
        return reproductor;
    }

    public abstract void play() throws OperacionInvalidaException;
    public abstract void pause() throws OperacionInvalidaException;
    public abstract void stop();

}
