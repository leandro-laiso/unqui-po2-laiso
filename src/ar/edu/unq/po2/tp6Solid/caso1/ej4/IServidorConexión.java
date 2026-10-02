package ar.edu.unq.po2.tp6Solid.caso1.ej4;

import java.util.List;

public interface IServidorConexión {

	public List<Correo> recibirNuevos(String user, String pass);

	public void conectar(String username, String pass);

	public void enviar(Correo correo);

}
