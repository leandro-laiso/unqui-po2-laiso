package ar.edu.utn.frba.tadp.entes;

public class Persona implements Nombrable {
	
	private String nombre;
	private Direccion direccion;
	
	public Persona() {
		super();
	}
	
	public Persona(String nombre, Direccion direccion) { // Constructor. Se llama igual que la clase, no define que devuelve
		this();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Direccion getDireccion() {
		return direccion;
	}
	
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return this.getNombre();
	}
}