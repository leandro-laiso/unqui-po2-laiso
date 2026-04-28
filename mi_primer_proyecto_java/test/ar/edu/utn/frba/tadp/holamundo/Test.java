package ar.edu.utn.frba.tadp.holamundo;

import java.util.Collection;
import java.util.ArrayList;

import ar.edu.utn.frba.tadp.entes.Nombrable;
import ar.edu.utn.frba.tadp.entes.Persona;

public class Test {
	
	public static void main(String[] args) {
		Collection<Nombrable> nombrables = getNombrables();
		Recepcionista recepcionista = makeRecepcionista();
		for(Nombrable nombrable : nombrables) {
			recepcionista.saludar(nombrable);
		}
	}
	
	private static Collection<Nombrable> getNombrables() {
		Collection<Nombrable> nombrables = new ArrayList<Nombrable>();
		nombrables.add(new Mundo());
		nombrables.add(new Persona("Juan"));
		nombrables.add(new Persona("José"));
		return nombrables;
	}
	
	private static Recepcionista makeRecepcionista() {
		return new RecepcionistaClasico();
	}

}
