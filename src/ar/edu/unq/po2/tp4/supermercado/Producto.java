package ar.edu.unq.po2.tp4.supermercado;

public class Producto {
	
	private String nombre;
	private Float precio;
	private Boolean esPrecioCuidado = false;
	

	public String getNombre() {
		return nombre;
	}
	
	public Float getPrecio() {
		return precio;
	}
	
	public Boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	public void aumentarPrecio(Float aumento) {
		precio += aumento;
	}
	
}
