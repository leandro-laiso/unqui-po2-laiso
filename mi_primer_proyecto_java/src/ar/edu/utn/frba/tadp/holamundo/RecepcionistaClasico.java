package ar.edu.utn.frba.tadp.holamundo;

import ar.edu.utn.frba.tadp.entes.Articulo;
import ar.edu.utn.frba.tadp.entes.Nombrable;

public class RecepcionistaClasico extends Recepcionista {

	@Override
	protected String armarSaludo(Nombrable nombrable) {
		return "hola " + getTitulo(nombrable) + " " + nombrable.getNombre();
	}
	
	private String getTitulo(Nombrable nombrable) {
		return nombrable.getClass().getAnnotation(Articulo.class).titulo();
	}

}
