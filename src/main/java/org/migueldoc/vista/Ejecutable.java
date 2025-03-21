package org.migueldoc.vista;

import org.gerdoc.historial.Historiales;

public interface Ejecutable extends org.gerdoc.vista.Ejecutable {

    void run();
    void addHistoriales(Historiales historiales);

}
