package org.migueldoc.inicio;

import org.gerdoc.historial.Historia;
import org.gerdoc.historial.Historiales;
import org.migueldoc.util.ReadUtil;
import org.migueldoc.vista.Ejecutable;
import org.migueldoc.vista.Menu;
import org.migueldoc.vista.TipoEjecutable;



    public class Inicio {

        public Inicio() {
        }

        public static void main(String[] args) {
            boolean flag = true;
            int opcion = 0;
            TipoEjecutable tipoEjecutable = null;
            Historiales historiales = null;
            Ejecutable ejecutable = null;
            historiales = Historia.getInstance();

            while (flag) {
                Menu.principal2();
                Menu.seleccionaOpcion();
                opcion = ReadUtil.readInt();
                tipoEjecutable = TipoEjecutable.getTipoEjecutableById(opcion);

                if (TipoEjecutable.SALIR.equals(tipoEjecutable)) {
                    flag = false;
                }

                if (TipoEjecutable.HISTORIAL.equals(tipoEjecutable)) {
                    historiales.imprimir();
                }

                if (TipoEjecutable.OPCION_ERRONEA.equals(tipoEjecutable)) {
                    Menu.opcionInvalida();
                }

                if (tipoEjecutable.getEjecutable() != null)
                {
                    ejecutable  = tipoEjecutable.getEjecutable();
                    ejecutable.addHistoriales(historiales);
                    ejecutable.run();
                }
            }
            Menu.despidada();
        }
    }