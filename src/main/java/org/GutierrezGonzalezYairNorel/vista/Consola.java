package org.GutierrezGonzalezYairNorel.vista;

import org.GutierrezGonzalezYairNorel.model.figura.*;
import org.GutierrezGonzalezYairNorel.model.figura.PoligonosR.PoligonoRegular;
import org.GutierrezGonzalezYairNorel.model.figura.figura2.Escaleno;
import org.GutierrezGonzalezYairNorel.model.figura.figura2.Isosceles;
import org.GutierrezGonzalezYairNorel.util.ReadUtil;
import org.gerdoc.historial.Historiales;
import org.gerdoc.vista.SolicitaDatos;

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
    public void ejecuta() {

    }

    @Override
    public void run( )
    {
        boolean flag = true;
        int opcion = 0;
        Figura figura = null;
        while( flag )
        {
            Menu.principal( );
            Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );
            figura = null;
            switch ( opcion )
            {
                case 1:
                    figura = new Cuadrado( );
                    break;
                case 2:
                    figura = new Equilatero( );
                    break;
                case 3:
                    figura = new Isosceles();
                    break;
                case 4:
                    figura = new Escaleno( );
                    break;
                case 5:
                    figura = new Circulo( );
                    break;
                case 6:
                    figura = new PoligonoRegular( );
                    break;
                case 7:
                    figura = new Rectangulo( );
                case 8:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida( );
            }

            if(figura != null)
            {
                ((SolicitaDatos)figura).leeDatos();
                org.GutierrezGonzalezYairNorel.vista.Menu.calcula(figura);
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
