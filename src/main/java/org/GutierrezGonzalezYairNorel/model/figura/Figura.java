package org.GutierrezGonzalezYairNorel.model.figura;

import org.GutierrezGonzalezYairNorel.vista.SolicitaDatos;

/**
 * 
 */
public abstract class Figura extends org.gerdoc.model.figura.Figura implements SolicitaDatos
{

    /**
     * Default constructor
     */


    public Figura()
    {
    }

    /**
     * @return
     */
    public abstract double area( );

    /**
     * @return
     */
    public abstract double perimetro();
}