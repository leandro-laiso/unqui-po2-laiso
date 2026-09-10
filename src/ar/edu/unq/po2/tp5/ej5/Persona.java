package ar.edu.unq.po2.tp5.ej5;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Comparable<Persona>, Nombrable{

    // Atributos
    private String nombre;
    private LocalDate fechaNacimiento;

    // Constructor
    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters
    @Override
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Métodos
    public int edad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    @Override
    public int compareTo(Persona p) {
        if (this.edad() < p.edad()) {
            return -1;
        } else if (this.edad() == p.edad()) {
            return 0;
        } else {
            return 1;
        }
    }
}
