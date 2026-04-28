package ar.edu.utn.frba.tadp.entes;


/**
* Es un Value Object (inmutable) que representa
* una dirección física
* @author Leo Gassman
*/
public class Direccion {
	
	private String calle;
	private int numero;
	
	/**
	* @param calle Calle o Avenida del domicilio, no puede ser null
	* @param numero Altura
	*/
	public Direccion(String calle, int numero) {
		this.calle = calle;
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return this.calle + " " + this.numero;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Direccion)) {
			return false;
		}
		Direccion otraDireccion = (Direccion) obj;
		return this.calle.equals(otraDireccion.calle) && this.numero == otraDireccion.numero; 
	}
	
	@Override
	public int hashCode() {
		return this.calle.hashCode() + this.numero;
	}
}
