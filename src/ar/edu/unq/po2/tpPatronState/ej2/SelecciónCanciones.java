package ar.edu.unq.po2.tpPatronState.ej2;

public class SelecciónCanciones extends EstadoReproducción {

    public SelecciónCanciones(Reproductor reproductor) {
        super(reproductor);
    }

    public void play() throws OperacionInvalidaException {
        this.getReproductor().getCancion().play();
        this.getReproductor().setEstado(new Reproduciendo(this.getReproductor()));
    }

    public void pause() throws OperacionInvalidaException {
        throw new OperacionInvalidaException("No se está reproduciendo ninguna canción");
    }

    public void stop() {
        // No hace nada
    }

}
