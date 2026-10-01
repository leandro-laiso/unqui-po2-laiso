package ar.edu.unq.po2.tp6Solid.caso1.solucionado;

import java.util.ArrayList;

public class ClienteEMailServidor {
	
	IServidorConexión servidor;
	String username;
	String pass;
	
	public ClienteEMailServidor(IServidorConexión servidor, String username, String pass){
		this.servidor=servidor;
		this.username=username;
		this.pass=pass;
		this.conectar();
	}
	
	public void conectar(){
		this.servidor.conectar(this.username,this.pass);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.username, this.pass);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

}
