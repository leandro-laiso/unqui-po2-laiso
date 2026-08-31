package ar.edu.unq.po2.tp3;

public class PersonaEquipoDeTrabajo {

    // Atributos
    private String nombre;
    private String apellido;
    private int edad;

    // Constructor
    public PersonaEquipoDeTrabajo(String nombre, String apellido, int edad) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
    }

    // Getters y Setters
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    private void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

}
