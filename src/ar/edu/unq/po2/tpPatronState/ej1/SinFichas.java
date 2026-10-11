package ar.edu.unq.po2.tpPatronState.ej1;

public class SinFichas implements EstadoMaquina {

    public void inicio() {
        this.mostrarMsjIngresoFichas();
    }

    public void ingresarFicha(Maquina maquina) {
        maquina.setEstado(new UnaFicha());
    }

    private void mostrarMsjIngresoFichas() {
        // Hace lo necesario para mostrar el mensaje
    }

}
