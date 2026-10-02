package ar.edu.unq.po2.tp6Solid.banco.ej3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BancoGestiónPréstamos {

    // Atributos
    List<SolicitudCrédito> solicitudes;

    // Constructor
    public BancoGestiónPréstamos() {
        this.solicitudes = new ArrayList<>();
    }

    // Getter
    public List<SolicitudCrédito> getSolicitudes() {
        return Collections.unmodifiableList(solicitudes);
    }

    // Métodos
    public void registrarSolicitud(SolicitudCrédito solicitud) {
        solicitudes.add(solicitud);
    }

    public double montoTotalADesembolsar() {
        return solicitudes
                .stream()
                .filter(SolicitudCrédito::esAceptable)
                .mapToDouble(SolicitudCrédito::getMontoTotal)
                .sum();
    }
}
