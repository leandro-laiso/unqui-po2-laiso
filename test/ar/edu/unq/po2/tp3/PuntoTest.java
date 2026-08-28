package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PuntoTest {

    @Test
    public void constructorTest() {
        Punto p = new Punto(0, 0);
        assertEquals(0, p.getX());
        assertEquals(0, p.getY());
    }

}
