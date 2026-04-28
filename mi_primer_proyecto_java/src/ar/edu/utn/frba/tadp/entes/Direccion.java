package ar.edu.utn.frba.tadp.entes;

public class Direccion {
	
	private String calle;
	private int numero;
	
	public Direccion(String calle, int numero) {
		this.calle = calle;
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return this.calle + " " + this.numero;
	}
}
