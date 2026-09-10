class Persona {

    // Atributos
    const nombre
    const fechaNacimiento  // Solo el año porque no hay fechas

    // Getters
    method getNombre() {
        return nombre;
    }

    method getFechaNacimiento() {
        return fechaNacimiento
    }

    // Métodos
    method edad() {
        return 2026 - fechaNacimiento
    }

    method esMayorQue(persona) {
        self.edad() > persona.edad()
    }

    method esMenorQue(persona) {
        self.edad() < persona.edad()
    }

}