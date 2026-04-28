package ar.edu.utn.frba.tadp.holamundo;

import ar.edu.utn.frba.tadp.entes.Articulo;
import ar.edu.utn.frba.tadp.entes.Nombrable;


public abstract class Recepcionista {
	
	public void saludar(Nombrable nombrable) {
		this.log(nombrable);
		System.out.println(this.armarSaludo(nombrable));
	}
	
	private void log(Nombrable nombrable) {
		System.out.println("saludando a " + getArticulo(nombrable) + " " +
		nombrable.getClass().getSimpleName());
	}
	
	private String getArticulo(Nombrable nombrable) {
		return nombrable.getClass().getAnnotation(Articulo.class).cardinal();
	}
	
	protected abstract String armarSaludo(Nombrable nombrable);
	
}
