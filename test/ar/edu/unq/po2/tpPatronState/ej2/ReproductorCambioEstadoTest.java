package ar.edu.unq.po2.tpPatronState.ej2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReproductorCambioEstadoTest {

    private Reproductor mp3;

    /*
    Inicialmente:
        - Estado es SelecciónCanciones

    Play:
        - En SelecciónCanciones, pasa a Reproduciendo
        - En Reproduciendo da error
        - En EnPausa da error

    Pause:
        - En SelecciónCanciones da error
        - En Reproduciendo, pasa a EnPausa
        - En EnPausa, pasa a Reproduciendo

    Stop:
        - En SelecciónCanciones no hace nada
        - En Reproduciendo, pasa a SelecciónCanciones
        - En EnPausa, pasa a SelecciónCanciones
     */

    @Test
    public void inicialmenteEstadoSeleccionCanciones() {
        mp3 = new Reproductor(); // Estado inicial: SelecciónCanciones
        assertInstanceOf(SelecciónCanciones.class, mp3.getEstado());
    }

    @Test
    public void enSeleccionCancionesPlayPasaAReproduciendo() throws OperacionInvalidaException {
        mp3 = new Reproductor();    // Estado inicial: SelecciónCanciones
        mp3.play();                 // Debería cambiar a Reproduciendo

        assertInstanceOf(Reproduciendo.class, mp3.getEstado());
    }

    @Test
    public void enSeleccionCancionesPauseDaError() throws Exception {
        mp3 = new Reproductor();    // Estado inicial: SelecciónCanciones
        assertThrows(OperacionInvalidaException.class, () -> mp3.pause());
    }

    @Test
    public void enSeleccionCancionesStopNoHaceNada() {
        mp3 = new Reproductor(); // Estado inicial: SelecciónCanciones

        assertDoesNotThrow(() -> mp3.stop());
        assertInstanceOf(SelecciónCanciones.class, mp3.getEstado());
    }

    @Test
    public void enReproduciendoPlayDaError() throws OperacionInvalidaException {
        mp3 = new Reproductor();    // Estado inicial: SelecciónCanciones
        mp3.play();                 // Debería cambiar a Reproduciendo
        assertThrows(OperacionInvalidaException.class, () -> mp3.play());
    }

    @Test
    public void enReproduciendoPausePasaAEnPausa() throws OperacionInvalidaException {
        mp3 = new Reproductor();    // Estado inicial: SelecciónCanciones
        mp3.play();                 // Debería cambiar a Reproduciendo
        mp3.pause();                // Debería cambiar a EnPausa
        assertInstanceOf(EnPausa.class, mp3.getEstado());
    }

    @Test
    public void enReproduciendoStopPasaASeleccionCanciones() throws OperacionInvalidaException {
        mp3 = new Reproductor();    // Estado inicial: SelecciónCanciones
        mp3.play();                 // Debería cambiar a Reproduciendo
        mp3.stop();                 // Debería cambiar a SelecciónCanciones
        assertInstanceOf(SelecciónCanciones.class, mp3.getEstado());
    }

    @Test
    public void enEnPausaPlayDaError() throws OperacionInvalidaException {
        mp3 = new Reproductor();    // Estado inicial: SelecciónCanciones
        mp3.play();                 // Debería cambiar a Reproduciendo
        mp3.pause();                // Debería cambiar a EnPausa
        assertThrows(OperacionInvalidaException.class, () -> mp3.play());
    }

    @Test
    public void enEnPausaPausePasaAReproduciendo() throws OperacionInvalidaException {
        mp3 = new Reproductor();    // Estado inicial: SelecciónCanciones
        mp3.play();                 // Debería cambiar a Reproduciendo
        mp3.pause();                // Debería cambiar a EnPausa
        mp3.pause();                // Debería cambiar a Reproduciendo
        assertInstanceOf(Reproduciendo.class, mp3.getEstado());
    }

    @Test
    public void enEnPausaStopPasaASeleccionCanciones() throws OperacionInvalidaException {
        mp3 = new Reproductor();    // Estado inicial: SelecciónCanciones
        mp3.play();                 // Debería cambiar a Reproduciendo
        mp3.pause();                // Debería cambiar a EnPausa
        mp3.stop();                 // Debería cambiar a SelecciónCanciones
        assertInstanceOf(SelecciónCanciones.class, mp3.getEstado());
    }
}