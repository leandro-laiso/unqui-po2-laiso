package ar.edu.unq.po2.tp7Mockito.ej5;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class PruebasParaRespuestas {

    @Test
    public void testOrden() {
        DOC mockDoc = mock(DOC.class); // Mock para el DOC necesario para SUT
        SUT sut = new SUT(mockDoc);    // SUT que utiliza el mock de su DOC

        // Se mandan los mensajes en un orden particular
        sut.hacerAlgo1(); // mockDoc.mensaje1();
        sut.hacerAlgo2(); // mockDoc.mensaje2();
        sut.hacerAlgo3(); // mockDoc.mensaje3()

        // Se verifica que el Mock Object haya recibido una vez cada mensaje, en cualquier orden.
        verify(mockDoc, times(1)).mensaje1();
        verify(mockDoc, times(1)).mensaje2();
        verify(mockDoc, times(1)).mensaje3();

        // Se crea un InOrder para verificar el orden de las invocaciones de mockDoc
        InOrder orden = inOrder(mockDoc);

        // Se verifica el orden de las invocaciones de los mensajes
        // El orden esperado es:
        //      mockDoc.mensaje1() -> mockDoc.mensaje2() -> mockDoc.mensaje3()
        orden.verify(mockDoc).mensaje1();
        orden.verify(mockDoc).mensaje2();
        orden.verify(mockDoc).mensaje3();
    }

    @Test
    public void testOrdenMultiplesMock() {
        // SUT 1
        DOC mockDoc1 = mock(DOC.class);  // Mock para el DOC necesario para SUT
        SUT sut1 = new SUT(mockDoc1);    // SUT que utiliza el mock de su DOC

        // SUT 2
        DOC mockDoc2 = mock(DOC.class);  // Mock para el DOC necesario para SUT
        SUT sut2 = new SUT(mockDoc2);    // SUT que utiliza el mock de su DOC

        // Se mandan los mensajes en un orden particular
        sut1.hacerAlgo1(); // mockDoc1.mensaje1();
        sut2.hacerAlgo1(); // mockDoc2.mensaje1();
        sut1.hacerAlgo3(); // mockDoc1.mensaje3()

        // Se verifica que cada Mock Object haya recibido una vez cada mensaje esperado, independientemente del orden.
        verify(mockDoc1, times(1)).mensaje1();
        verify(mockDoc2, times(1)).mensaje1();
        verify(mockDoc1, times(1)).mensaje3();

        // Se crea un InOrder para verificar el orden de las invocaciones entre ambos mockDoc1 y mockDoc2
        InOrder orden = inOrder(mockDoc1, mockDoc2);
        // Permite verificar el orden de las interacciones entre los DOCs, no solamente el orden de los mensajes dentro de un único mock.

        // Se verifica el orden de las invocaciones de los mensajes
        // El orden esperado es:
        //      mockDoc1.mensaje1() -> mockDoc2.mensaje1() -> mockDoc1.mensaje3()
        orden.verify(mockDoc1).mensaje1();
        orden.verify(mockDoc2).mensaje1();
        orden.verify(mockDoc1).mensaje3();
    }

    @Test
    public void testOrdenYObligatoriedadDeRecepción() {
        DOC mockDoc = mock(DOC.class);  // Mock para el DOC necesario para SUT
        SUT sut = new SUT(mockDoc);     // SUT que utiliza el mock de su DOC

        // mockDoc ya está preparado para recibir invocaciones a mensajes de la clase DOC
        // Se mandan los mensajes
        sut.hacerAlgo1(); // mockDoc.mensaje1()
        sut.hacerAlgo2(); // mockDoc.mensaje2()
        sut.hacerAlgo3(); // mockDoc.mensaje3()

        // Se verifica que mockDoc haya recibido una vez cada mensaje sin exigir un orden particular.
        // Si no se desea exigir que mockDoc haya recibido los mensajes, no se realizan las verificaciones verify().
        verify(mockDoc, times(1)).mensaje1();
        verify(mockDoc, times(1)).mensaje2();
        verify(mockDoc, times(1)).mensaje3();
    }
}
