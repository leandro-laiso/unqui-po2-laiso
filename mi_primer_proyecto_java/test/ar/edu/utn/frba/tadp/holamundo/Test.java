package ar.edu.utn.frba.tadp.holamundo;

public class Test {
	
	public static void main(String[] args) {
		Mundo mundo = new Mundo();
		new RecepcionistaClasico().saludar(mundo);
		new RecepcionistaFormal().saludar(mundo);
	}
	
}
