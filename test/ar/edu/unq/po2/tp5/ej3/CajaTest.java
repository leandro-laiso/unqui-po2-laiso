package ar.edu.unq.po2.tp5.ej3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CajaTest {

    private Caja caja;
    private Producto arroz;
    private ProductoCooperativa leche;
    private Agencia agencia;
    private Servicio servicio;
    private Impuesto impuesto;

    @BeforeEach
    public void setUp() {
        caja = new Caja();
        arroz = new Producto(15.0, 20);
        leche = new ProductoCooperativa(10.0, 3);
        agencia = new ClaseQueImplementaAgencia();
        servicio = new Servicio(agencia, 1250.0, 4);
        impuesto = new Impuesto(agencia, 4000.0);
    }

    @Test
    public void testConstructor() {
        assertEquals(0.0, caja.getMontoAPagar());
    }

    @Test
    public void testRegistrarArticuloProducto() {
        // Se registra un Producto
        caja.registrarArtículo(arroz);

        // El stock del producto debe haber disminuido
        assertEquals(19, arroz.getStock());

        // El monto a pagar de la caja debe haber aumentado correctamente al registrar el producto
        assertEquals(15.0, caja.getMontoAPagar());
    }

    @Test
    public void testRegistrarArticuloProductoCooperativa() {
        // Se registra un ProductoCooperativa
        caja.registrarArtículo(leche);

        // El stock del producto debe haber disminuido
        assertEquals(2, leche.getStock());

        // El monto a pagar de la caja debe haber aumentado correctamente al registrar el producto
        assertEquals(9.0, caja.getMontoAPagar());
    }

    @Test
    public void testRegistrarArticuloServicio() {
        // Se registra un Servicio
        caja.registrarArtículo(servicio);

        // El servicio debería haberse procesado informando el pago a su agencia
        // (en este caso no hace nada, solamente debe no fallar)

        // El monto a pagar de la caja debe haber aumentado correctamente al registrar el servicio
        assertEquals(5000.0, caja.getMontoAPagar());
    }

    @Test
    public void testRegistrarArticuloImpuesto() {
        // Se registra un Impuesto
        caja.registrarArtículo(impuesto);

        // El impuesto debería haberse procesado informando el pago a su agencia
        // (en este caso no hace nada, solamente debe no fallar)

        // El monto a pagar de la caja debe haber aumentado correctamente al registrar el impuesto
        assertEquals(4000.0, caja.getMontoAPagar());
    }

    @Test
    public void testRegistrarArticulosVarios() {
        // Se registra un Producto, un ProductoCooperativa, un Servicio y un Impuesto.
        caja.registrarArtículo(arroz);
        caja.registrarArtículo(leche);
        caja.registrarArtículo(servicio);
        caja.registrarArtículo(impuesto);

        // El stock de los productos debe haber disminuido
        assertEquals(19, arroz.getStock());
        assertEquals(2, leche.getStock());

        // El servicio y el impuesto deberían haberse procesado informando el pago a su agencia
        // (en este caso no hace nada, solamente debe no fallar)

        // El monto a pagar de la caja debe haber aumentado correctamente al registrar todos los artículos
        assertEquals(9024.0, caja.getMontoAPagar());
    }


}
