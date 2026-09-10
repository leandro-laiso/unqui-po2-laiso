package ar.edu.unq.po2.tp5.ej5;

import org.junit.jupiter.api.BeforeEach;

import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.lang.IO.print;
import static java.lang.IO.println;

public class PersonaMascotaTest {

    static void main() {

        Persona leandro, ulises;
        Mascota perro, gato;
        List<Nombrable> coleccion = new ArrayList<>();

        // Instancio las dos personas
        leandro = new Persona("Leandro", LocalDate.of(2005, 11, 30));
        ulises = new Persona("Ulises", LocalDate.of(2001, 8, 31));

        // Instancio las dos mascotas
        perro = new Mascota("Keke", "Perro");
        gato = new Mascota("Mauro", "Gato");

        // Inserto las personas y las mascotas en una colección
        coleccion.add(leandro);
        coleccion.add(ulises);
        coleccion.add(perro);
        coleccion.add(gato);

        coleccion.forEach(nombrable -> {
            println(nombrable.getNombre());
        });
    }
}
