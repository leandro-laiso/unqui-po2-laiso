package ar.edu.utn.frba.tadp.entes;

public class Persona {
	
	private String nombre;
	
	public Persona() {
		super();
	}
	
	public Persona(String nombre) { // Constructor. Se llama igual que la clase, no define que devuelve
		this();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}