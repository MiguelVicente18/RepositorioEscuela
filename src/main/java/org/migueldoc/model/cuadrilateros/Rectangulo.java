package org.migueldoc.model.cuadrilateros;

import org.migueldoc.model.figura.Cuadrado;
import org.migueldoc.util.ReadUtil;
import org.migueldoc.vista.Menu;

public class Rectangulo extends Cuadrado {
    private double lado2;
    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        super(lado1);
        this.lado2 = lado2;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double area()
    {
        return lado1 * lado2;
    }

    public double perimetro()
    {
        return lado2 + lado2 + lado1 + lado1;
    }

    @Override
    public void leeDatos() {
        super.leeDatos();
        Menu.leeLado2();
        lado2 = ReadUtil.readDouble();

    }
}