package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajoTest {

    // Se crean las personas
    private PersonaEquipoDeTrabajo p1 = new PersonaEquipoDeTrabajo("Juan", "Gutierrez", 34);
    private PersonaEquipoDeTrabajo p2 = new PersonaEquipoDeTrabajo("Martin", "Gomez", 23);
    private PersonaEquipoDeTrabajo p3 = new PersonaEquipoDeTrabajo("Rodolfo", "Rodriguez", 45);
    private PersonaEquipoDeTrabajo p4 = new PersonaEquipoDeTrabajo("Martin", "Miranda", 30);
    private PersonaEquipoDeTrabajo p5 = new PersonaEquipoDeTrabajo("Jorge", "Lopez", 50);

    // Se crea la lista de personas
    private ArrayList<PersonaEquipoDeTrabajo> listaPersonas = new ArrayList<>();

    // Se crea el equipo de trabajo
    private EquipoDeTrabajo equipo1 = new EquipoDeTrabajo("Lexor", listaPersonas);

    public void main(String[] args) {
        listaPersonas.add(p1);
        listaPersonas.add(p2);
        listaPersonas.add(p3);
        listaPersonas.add(p4);
        listaPersonas.add(p5);
        System.out.println("El promedio de edad del equipo de trabajo es: " + equipo1.promedioEdad());
    }

}
