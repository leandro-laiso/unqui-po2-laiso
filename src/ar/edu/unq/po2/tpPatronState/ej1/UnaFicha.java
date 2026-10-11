package ar.edu.unq.po2.tpPatronState.ej1;

public class UnaFicha implements EstadoMaquina {

    public void inicio() {
        this.iniciarJuegoUnJugador();
    }

    public void ingresarFicha(Maquina maquina) {
        maquina.setEstado(new DosFichas());
    }

    private void iniciarJuegoUnJugador() {
        // Hace lo necesario para iniciar el juego en el modo de un jugador
    }

}
