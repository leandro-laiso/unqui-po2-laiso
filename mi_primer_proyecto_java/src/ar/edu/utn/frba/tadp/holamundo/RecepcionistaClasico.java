package ar.edu.utn.frba.tadp.holamundo;

public class RecepcionistaClasico extends Recepcionista {

	@Override
	protected String armarSaludo(Mundo mundo) {
		return "hola " + mundo.getNombre();
	}

}
