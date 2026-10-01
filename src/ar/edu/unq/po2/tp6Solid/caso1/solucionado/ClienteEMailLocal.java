package ar.edu.unq.po2.tp6Solid.caso1.solucionado;

import java.util.ArrayList;

public class ClienteEMailLocal {

	ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;

	public ClienteEMailLocal(){
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}

}
