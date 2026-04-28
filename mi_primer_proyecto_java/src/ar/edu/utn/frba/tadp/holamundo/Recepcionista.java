package ar.edu.utn.frba.tadp.holamundo;

public abstract class Recepcionista {
	
	public void saludar(Mundo mundo) {
		System.out.println(this.armarSaludo(mundo));
	}
	
	protected abstract String armarSaludo(Mundo mundo);
	
}
