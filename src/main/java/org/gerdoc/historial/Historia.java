package org.gerdoc.historial;

import org.gerdoc.model.figura.Figura;

import java.util.ArrayList;
import java.util.List;

public class Historia implements Historiales
{
    private static Historia historia;
    private List<Figura> list;

    private Historia()
    {
    }

    public static Historia getInstance( )
    {
        if( historia == null )
        {
            historia = new Historia( );
        }
        return historia;
    }

    @Override
    public void imprimir()
    {
        if( list == null || list.isEmpty( ) )
        {
            System.out.println( "Lista vacia");
            return;
        }
        list.forEach( f -> {
            System.out.println("Figura : " + f.getClass().getSimpleName());
            System.out.println( "El Perimetro es:" + f.perimetro( ) );
            System.out.println( "El Area es:" + f.area( ) );
        });
    }

    @Override
    public void addFigura(Figura figura)
    {
        if( list == null)
        {
            list = new ArrayList<>( );
        }
        list.add( figura );
    }
}
