package ar.edu.unq.po2.tp4.ej1;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

    // Atributos
    private String nombre;
    private String dirección;
    private List<Producto> productos;

    // Constructores
    public Supermercado(String nombre, String dirección) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.productos = new ArrayList<Producto>();
    }

    // Getters & Setters

    // Métodos
    public int getCantidadDeProductos() {
        return productos.size();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Double getPrecioTotal() {
        Double resultado = 0.0;
        for (Producto p : productos) {
            resultado += p.getPrecio();
        }
        return resultado;
    }

}
