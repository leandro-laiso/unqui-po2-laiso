package ar.edu.unq.po2.tp6Solid.banco.ej3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BancoGestiónClientesTest {

    private BancoGestiónClientes bancoGC;

    @BeforeEach
    public void setUp() {
        bancoGC = new BancoGestiónClientes();
    }

    @AfterEach
    public void teardown() {
        bancoGC = null;
    }

    @Test
    public void testConstructor() {
        List<Cliente> clientes = bancoGC.getClientes();
        assertTrue(clientes.isEmpty());
    }

    @Test
    public void testAgregarCliente() {
        Cliente cliente = new Cliente("Leandro", "Laiso", "Quilmes", 20, 1000.0);
        bancoGC.agregarCliente(cliente);
        List<Cliente> clientes = bancoGC.getClientes();

        assertFalse(clientes.isEmpty());
        assertEquals(1, clientes.size());
        assertSame(clientes.getFirst(), cliente);
    }

}
