package ar.edu.unq.po2.tpPatronTemplateMethodYAdapter.ej7;

import javax.swing.*;

public class AdapterListaDePalabrasOrdenadas extends DefaultListModel {

    private final ListaDePalabrasOrdenadas adaptee;

    public AdapterListaDePalabrasOrdenadas() {
        this.adaptee = new ListaDePalabrasOrdenadas();
    }

    @Override
    public void addElement(Object e) {
        adaptee.agregarPalabra(e.toString());
    }

    @Override
    public int getSize() {
        return adaptee.cantidadDePalabras();
    }

    @Override
    public Object getElementAt(int index) {
        return adaptee.getPalabraDePosicion(index);
    }

}
