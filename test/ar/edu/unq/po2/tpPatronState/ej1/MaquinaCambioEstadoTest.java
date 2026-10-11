package ar.edu.unq.po2.tpPatronState.ej1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class MaquinaCambioEstadoTest {

    public Maquina maquina;

    @BeforeEach
    public void setUp() {
        maquina = null;
    }

    @Test
    public void unaMaquinaIniciaSinFichas() {
        // Encender la máquina
        maquina = new Maquina();

        // Chequear el estado
        assertInstanceOf(SinFichas.class, maquina.getEstado());
    }

    @Test
    public void alIngresarUnaFichaPasaAEstadoUnaFicha() {
        // Encender la máquina
        maquina = new Maquina();

        // Ingresar una ficha
        maquina.ingresarFicha();

        // Chequear el estado
        assertInstanceOf(UnaFicha.class, maquina.getEstado());
    }

    @Test
    public void alIngresarDosFichasPasaAEstadoDosFichas() {
        // Encender la máquina
        maquina = new Maquina();

        // Ingresar dos fichas
        maquina.ingresarFicha();
        maquina.ingresarFicha();

        // Chequear el estado
        assertInstanceOf(DosFichas.class, maquina.getEstado());
    }

    @Test
    public void alIngresarTresFichasRechazaTercerFicha() {
        // Encender la máquina
        maquina = new Maquina();

        // Ingresar Tres fichas
        maquina.ingresarFicha();
        maquina.ingresarFicha();
        maquina.ingresarFicha();

        // Chequear el estado
        assertInstanceOf(DosFichas.class, maquina.getEstado());
    }

    @Test
    public void alIngresarUnaFichaYFinalizarJuegoPasaAEstadoSinFichas() {
        // Encender la máquina
        maquina = new Maquina();

        // Ingresar una ficha
        maquina.ingresarFicha();

        // Iniciar juego
        maquina.inicio();

        // Finaliza el juego
        maquina.finJuego();

        // Chequear el estado
        assertInstanceOf(SinFichas.class, maquina.getEstado());
    }

    @Test
    public void alIngresarDosFichasYFinalizarJuegoPasaAEstadoSinFichas() {
        // Encender la máquina
        maquina = new Maquina();

        // Ingresar dos fichas
        maquina.ingresarFicha();
        maquina.ingresarFicha();

        // Iniciar juego
        maquina.inicio();

        // Finaliza el juego
        maquina.finJuego();

        // Chequear el estado
        assertInstanceOf(SinFichas.class, maquina.getEstado());
    }

    @Test
    public void alFinalizarJuegoSePuedenVolverAIngresarFichas() {
        // Encender la máquina
        maquina = new Maquina();

        // Ingresar una ficha
        maquina.ingresarFicha();

        // Iniciar juego
        maquina.inicio();

        // Finaliza el juego
        maquina.finJuego();

        // Ingresar una ficha
        maquina.ingresarFicha();

        // Chequear el estado
        assertInstanceOf(UnaFicha.class, maquina.getEstado());
    }

}
