package org.gerdoc.vista;

import org.gerdoc.historial.Historia;
import org.gerdoc.historial.Historiales;

public interface Ejecutable
    {
    void run( );
    void addHistoriales(Historiales historiales);
}