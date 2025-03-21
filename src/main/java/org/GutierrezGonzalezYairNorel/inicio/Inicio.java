package org.GutierrezGonzalezYairNorel.inicio;

import org.GutierrezGonzalezYairNorel.util.ReadUtil;
import org.GutierrezGonzalezYairNorel.vista.Consola;
import org.GutierrezGonzalezYairNorel.vista.Ejecutable;
import org.GutierrezGonzalezYairNorel.vista.Menu;
import org.GutierrezGonzalezYairNorel.vista.Ventana;

public class Inicio {

    public Inicio() {
    }

    public static void main(String[] args)
    {
        boolean flag = true;
        int opcion = 0;
        Ejecutable ejecutable = null;
        while( flag )
        {
            Menu.principal2( );
            Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );
            switch ( opcion )
            {
                case 1:
                    ejecutable = Consola.getInstance( );
                    break;
                case 2:
                    ejecutable = Ventana.getInstance( );
                    break;
                case 3:
                    flag = false;
                    ejecutable = null;
                    break;
                default:
                    Menu.opcionInvalida( );
            }
            if( ejecutable != null )
            {
                ejecutable.run( );
            }
        }

    }

}