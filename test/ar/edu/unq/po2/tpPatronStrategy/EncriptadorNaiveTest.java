package ar.edu.unq.po2.tpPatronStrategy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EncriptadorNaiveTest {

    private EncriptadorNaive encNaive;
    private Encriptador ordenPalabras;
    private Encriptador cambiarVocales;
    private Encriptador codificacionNum;
    private String texto;

    @BeforeEach
    public void setUp() {
        encNaive = new EncriptadorNaive();
        ordenPalabras = new CambiarOrdenPalabras();
        cambiarVocales = new CambiarVocales();
        codificacionNum = new CodificacionNumeros();
        texto = "esto es un trabajo practico de programacion con objetos";
    }

    /*
    Encriptaciones:
        - CambiarOrdenPalabras
            - Input encriptar / output desencriptar = "esto es un trabajo practico de programacion con objetos"
            - Output encriptar / input desencriptar = "objetos con programacion de practico trabajo un es esto"
        - CambiarVocales
            - Input encriptar / output desencriptar = "esto es un trabajo practico de programacion con objetos"
            - Output encriptar / input desencriptar = "istu is an trebeju prectocu di prugremecoun cun ubjitus"
        - CodificacionNumeros
            - Input encriptar / output desencriptar = "esto es un trabajo practico"
            - Output encriptar / input desencriptar = "5,19,20,15,0,5,19,0,21,14,0,20,18,1,2,1,10,15,0,16,18,1,3,20,9,3,15"
     */

    @Test
    public void encriptacionOrdenPalabras() {
        // Exercise
        String textoEncriptado = encNaive.encriptar(texto);

        // Verify
        assertEquals("objetos con programacion de practico trabajo un es esto", textoEncriptado);
    }

    @Test
    public void desencriptacionOrdenPalabras() {
        // Exercise
        String textoDesencriptado = encNaive.desencriptar(encNaive.encriptar(texto));

        // Verify
        assertEquals("esto es un trabajo practico de programacion con objetos", textoDesencriptado);
    }

    @Test
    public void encriptacionCambiarVocales() {
        // Exercise
        encNaive.setEncriptador(cambiarVocales);
        String textoEncriptado = encNaive.encriptar(texto);

        // Verify
        assertEquals("istu is an trebeju prectocu di prugremecoun cun ubjitus", textoEncriptado);
    }

    @Test
    public void desencriptacionCambiarVocales() {
        // Exercise
        encNaive.setEncriptador(cambiarVocales);
        String textoDesencriptado = encNaive.desencriptar(encNaive.encriptar(texto));

        // Verify
        assertEquals("esto es un trabajo practico de programacion con objetos", textoDesencriptado);
    }

    @Test
    public void encriptacionCodificacionNumeros() {
        // Exercise
        encNaive.setEncriptador(codificacionNum);
        String textoEncriptado = encNaive.encriptar("esto es un trabajo practico");

        // Verify
        assertEquals("5,19,20,15,0,5,19,0,21,14,0,20,18,1,2,1,10,15,0,16,18,1,3,20,9,3,15", textoEncriptado);
    }

    @Test
    public void desencriptacionCodifiacionNumeros() {
        // Exercise
        encNaive.setEncriptador(codificacionNum);
        String textoDesencriptado = encNaive.desencriptar(encNaive.encriptar("esto es un trabajo practico"));

        // Verify
        assertEquals("esto es un trabajo practico", textoDesencriptado);
    }


    @AfterEach
    public void teardown() {
        encNaive = null;
        ordenPalabras = null;
        cambiarVocales = null;
        codificacionNum = null;
    }
}
