package org.migueldoc.vista;

import org.gerdoc.historial.Historiales;
import org.migueldoc.model.figura.Figura;
import org.migueldoc.util.FiguraFactory;
import org.migueldoc.util.ReadUtil;


public class Consola implements Ejecutable
{
    private static Consola consola;
    private Historiales historiales;

    private Consola()
    {
    }

    public static Consola getInstance( )
    {
        if(consola==null)
        {
            return new Consola();
        }
        return consola;
    }

    @Override
    public void run( )
    {
        boolean flag = true;
        int opcion = 0;
        Figura figura = null;
        FiguraEnum figuraEnum = null;

        while( flag )
        {
            Menu.principaMenu( );
            Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );
            figuraEnum=FiguraEnum.getFiguraEnumById(opcion);

            if(FiguraEnum.SALIR.equals(figuraEnum)){
                flag=false;
            }

            if (FiguraEnum.OPCION_ERRONEA.equals(figuraEnum)){
                Menu.opcionInvalida();
            }

            figura = FiguraFactory.getFiguraByFiguraEnum(figuraEnum);
            if(figura != null)
            {
                ((SolicitaDatos)figura).leeDatos();
                Menu.calcular(figura);
                if(historiales != null)
                {
                    historiales.addFigura(figura);
                }
            }
        }
    }

    @Override
    public void addHistoriales(Historiales historiales) {
        this.historiales = historiales;
    }
}