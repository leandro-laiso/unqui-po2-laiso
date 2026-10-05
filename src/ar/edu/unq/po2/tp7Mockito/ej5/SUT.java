package ar.edu.unq.po2.tp7Mockito.ej5;

public class SUT {

    private DOC doc;

    public SUT(DOC doc) {
        this.doc = doc;
    }

    public void hacerAlgo1() {
        doc.mensaje1();
    }

    public void hacerAlgo2() {
        doc.mensaje2();
    }

    public void hacerAlgo3() {
        doc.mensaje3();
    }
}
