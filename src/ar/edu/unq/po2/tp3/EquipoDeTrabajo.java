package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {

    // Atributos
    private String nombre;
    private ArrayList<PersonaEquipoDeTrabajo> integrantes;

    // Constructor
    public EquipoDeTrabajo(String nombre, ArrayList<PersonaEquipoDeTrabajo> integrantes) {
        this.setNombre(nombre);
        this.setIntegrantes(integrantes);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setIntegrantes(ArrayList<PersonaEquipoDeTrabajo> integrantes) {
        this.integrantes = integrantes;
    }

    // Métodos

    /**
     *
     * @return El promedio de edad de los integrantes del equipo de trabajo.
     */
    public double promedioEdad() {
        double sumatoria = 0;
        for (PersonaEquipoDeTrabajo persona: integrantes) {
            sumatoria += persona.getEdad();
        }
        return integrantes.isEmpty() ? 0 : sumatoria / integrantes.size();
    }

}
