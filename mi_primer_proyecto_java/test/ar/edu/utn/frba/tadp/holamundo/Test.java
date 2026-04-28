package ar.edu.utn.frba.tadp.holamundo;

import java.util.Collection;
import java.util.ArrayList;

import ar.edu.utn.frba.tadp.entes.Nombrable;
import ar.edu.utn.frba.tadp.entes.Persona;
import ar.edu.utn.frba.tadp.entes.Direccion;

public class Test {

	//  Para colecciones
//	public static void main(String[] args) {
//		Collection<Nombrable> nombrables = getNombrables();
//		Recepcionista recepcionista = makeRecepcionista();
//		for(Nombrable nombrable : nombrables) {
//			recepcionista.saludar(nombrable);
//		}
//	}
	
	// Para probar la Dirección
//	public static void main(String[] args) {
//		Persona persona = new Persona("Leo", new Direccion("Esteban de luca", 1322));
//		System.out.println("La persona " + persona + " vive en " + persona.getDireccion());
//	}
	
	// Para probar == (éxito, se hace referencia a la misma instancia de direccion)
//	public static void main(String[] args) {
//		Direccion direccion = new Direccion("Esteban de Luca", 1322);
//		Persona persona = new Persona("Leo", direccion);
//		if (persona.viveEn(direccion)){
//			System.out.println(persona + " vive en " + direccion);
//		} else {
//			System.out.println(persona + " no vive en " + direccion + ", vive en " + persona.getDireccion());
//		}
//	}
	
	// Para probar == (fallo, la direccion es la misma pero en diferentes instancias)
	public static void main(String[] args) {
		Direccion direccion = new Direccion("Esteban de Luca", 1322);
		Persona persona = createPersona();
		if(persona.viveEn(direccion)){
			System.out.println(persona + " vive en " + direccion);
		} else {
			System.out.println(persona + " no vive en " + direccion +", vive en " +
				persona.getDireccion());
		}
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
	
	private static Persona createPersona() {
		return new Persona("Leo", new Direccion("Esteban de Luca",1322));
	}

}
