package ar.edu.utn.frba.tadp.holamundo;

import java.util.Collection;
import java.util.ArrayList;

import ar.edu.utn.frba.tadp.entes.Nombrable;
import ar.edu.utn.frba.tadp.entes.Persona;
import ar.edu.utn.frba.tadp.entes.Direccion;

public class Test {

// Para colecciones
//	public static void main(String[] args) {
//		Collection<Nombrable> nombrables = getNombrables();
//		Recepcionista recepcionista = makeRecepcionista();
//		for(Nombrable nombrable : nombrables) {
//			recepcionista.saludar(nombrable);
//		}
//	}
	
	// Para probar la Dirección
	public static void main(String[] args) {
		Persona persona = new Persona("Leo", new Direccion("Esteban de luca", 1322));
		System.out.println("La persona " + persona + " vive en " + persona.getDireccion());
	}
	
	private static Collection<Nombrable> getNombrables() {
		Collection<Nombrable> nombrables = new ArrayList<Nombrable>();
		nombrables.add(new Mundo());
		nombrables.add(new Persona("Juan", new Direccion("Esteban de luca", 1322)));
		nombrables.add(new Persona("José", new Direccion("Alfonsina Storni", 770)));
		return nombrables;
	}
	
	private static Recepcionista makeRecepcionista() {
		return new RecepcionistaClasico();
	}

}
