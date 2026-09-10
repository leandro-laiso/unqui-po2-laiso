package ar.edu.unq.po2.tp5.ej5;

public class Mascota implements Nombrable{

    // Atributos
    private String nombre;
    private String raza;

    // Constructor
    public Mascota(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    // Getters
    @Override
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }
}
