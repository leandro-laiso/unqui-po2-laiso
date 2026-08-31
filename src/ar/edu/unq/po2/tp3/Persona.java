package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

//	1. Responder: Si un objeto cualquiera que le pide la edad a una Persona: ¿Conoce cómo ésta calcula u
//	obtiene tal valor? ¿Cómo se llama el mecanismo de abstracción que permite esto?

//	Respuesta: Un objeto cualquiera que le pide la edad a una Persona NO CONOCE cómo ésta calcula dicho valor.
//	El mecanismo de abstracción que permite esto es conocido como ENCAPSULAMIENTO. Los detalles internos de funcionamiento
//	de una clase están ocultos, y desde fuera sólo se conoce la interfaz pública (en este caso, el método getEdad() que devuelve la edad
//	de la persona, sin saber como se calcula internamente).

public class Persona {

    // Atributos
    private String nombre;
    private LocalDate fecNac;

    // Constructor
    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fecNac = fechaNacimiento;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecNac() {
        return fecNac;
    }

    // Métodos

    /**
     *
     * @return La edad de la persona.
     */
    public int getEdad() {
        return Period.between(fecNac, LocalDate.now()).getYears();
    }

    /**
     *
     * @param persona La instancia de Persona con la que se va a comparar la edad.
     * @return true si la persona receptora es menor en edad que la recibida por parámetro, false en caso contrario.
     */
    public boolean menorQue(Persona persona) {
        return this.getEdad() < persona.getEdad();
    }
}
