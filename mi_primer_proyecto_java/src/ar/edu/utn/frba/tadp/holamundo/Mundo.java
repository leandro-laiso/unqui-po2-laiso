package ar.edu.utn.frba.tadp.holamundo;
import ar.edu.utn.frba.tadp.entes.Nombrable;
import ar.edu.utn.frba.tadp.entes.Articulo;

@Articulo("un")
public class Mundo implements Nombrable {
	
	public String getNombre() {
		return "Mundo";
	}
	
}
