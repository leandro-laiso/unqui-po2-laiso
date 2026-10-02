package ar.edu.unq.po2.tp6Solid.banco.ej3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BancoGestiónClientes {

    // Atributos
    private List<Cliente> clientes;

    // Constructor
    public BancoGestiónClientes() {
        this.clientes = new ArrayList<>();
    }

    // Getters
    public List<Cliente> getClientes() {
        return Collections.unmodifiableList(clientes);
    }

    // Métodos
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

}
