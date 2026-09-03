package ar.edu.unq.po2.tp4.ej1;

public class Producto {

    // Atributos
    private String nombre;
    private Double precio;
    private boolean esPrecioCuidado;

    // Constructores
    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.esPrecioCuidado = false;
    }

    public Producto(String nombre, Double precio, boolean esPrecioCuidado) {
        this(nombre, precio);
        this.esPrecioCuidado = esPrecioCuidado;
    }


    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public boolean esPrecioCuidado() {
        return esPrecioCuidado;
    }

    // Métodos
    public void aumentarPrecio(Double aumento) {
        precio += aumento;
    }

}
