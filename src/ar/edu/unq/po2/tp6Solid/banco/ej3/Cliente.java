package ar.edu.unq.po2.tp6Solid.banco.ej3;

public class Cliente {

    // Atributos
    private String nombre;
    private String apellido;
    private String dirección;
    private int edad;
    private double sueldoNetoMensual;

    // Constructor
    public Cliente(String nombre, String apellido, String dirección, int edad, double sueldoNetoMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirección = dirección;
        this.edad = edad;
        this.sueldoNetoMensual = sueldoNetoMensual;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDirección() {
        return dirección;
    }

    public int getEdad() {
        return edad;
    }

    public double sueldoNetoMensual() {
        return sueldoNetoMensual;
    }

    // Métodos
    public double sueldoNetoAnual() {
        return this.sueldoNetoMensual() * 12;
    }

}
