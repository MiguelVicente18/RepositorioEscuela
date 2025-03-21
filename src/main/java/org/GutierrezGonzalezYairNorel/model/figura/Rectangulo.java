package org.GutierrezGonzalezYairNorel.model.figura;

import org.GutierrezGonzalezYairNorel.util.ReadUtil;
import org.GutierrezGonzalezYairNorel.vista.Menu;

public class Rectangulo extends Figura
{
    public double base;
    public double altura;
    public Rectangulo(double base, double altura)
    {
        this.base=base;
        this.altura=altura;
    }
    public Rectangulo( )
    {

    }

    @Override
    public double area() {
        return base * altura / 2;
    }

    @Override
    public double perimetro() {
        return 2*(base + altura);
    }

    @Override
    public void leeDatos() {
        Menu.leeBase();
        base = ReadUtil.readDouble();
        Menu.leeAltura();
        altura = ReadUtil.readDouble();
    }
}
