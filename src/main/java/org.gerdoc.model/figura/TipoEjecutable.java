package org.gerdoc.model.figura;

import org.gerdoc.historial.Historia;
import org.gerdoc.historial.Historiales;
import org.gerdoc.vista.Consola;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.Ventana;

public enum TipoEjecutable {
    CONSOLA(1, Consola.getInstance()),
    VENTANA(2, Ventana.getInstance()),
    CONSOLA_MIGUEL(3, org.migueldoc.vista.Consola.getInstance()),
    VENTANA_MIGUEL(4, org.migueldoc.vista.Ventana.getInstance()),
    CONSOLA_YAIR(5, org.GutierrezGonzalezYairNorel.vista.Consola.getInstance()),
    VENTANA_YAIR(6, org.GutierrezGonzalezYairNorel.vista.Ventana.getInstance()),
    HISTORIAL(3, null),
    SALIR(4, null),
    OPCION_ERRONEA(5, null);
    private Integer id;
    private Ejecutable ejecutable;

    TipoEjecutable(Integer id, Ejecutable ejecutable) {
        this.id = id;
        this.ejecutable = ejecutable;
    }

    public Integer getId() {
        return id;
    }

    public static TipoEjecutable getTipoEjecutableById(int opcion) {
        switch (opcion) {
            case 1:
                return CONSOLA;
            case 2:
                return VENTANA;
            case 3:
                return CONSOLA_MIGUEL;
            case 4:
                return VENTANA_MIGUEL;
            case 5:
                return CONSOLA_YAIR;
            case 6:
                return VENTANA_YAIR;
            case 7:
                return HISTORIAL;
            case 8:
                return SALIR;
            default:
                return OPCION_ERRONEA;
        }
    }

    public Ejecutable getEjecutable() {
        return ejecutable;
    }
}