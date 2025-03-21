package org.GutierrezGonzalezYairNorel.model.figura;

import org.GutierrezGonzalezYairNorel.util.ReadUtil;
import org.GutierrezGonzalezYairNorel.vista.Menu;

public class Circulo extends Figura
{
    private double radio;
    public Circulo(double radio)
    {
        this.radio=radio;
    }
    public Circulo()
    {

    }

    @Override
    public double area() {
        return Math.PI*radio*radio;
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public void leeDatos() {
        Menu.leeradio();
        radio = ReadUtil.readDouble();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
