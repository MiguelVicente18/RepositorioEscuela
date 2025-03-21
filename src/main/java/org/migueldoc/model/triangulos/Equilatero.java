package org.migueldoc.model.triangulos;

import org.migueldoc.model.figura.Triangulo;
import org.migueldoc.util.ReadUtil;
import org.migueldoc.vista.Menu;

public class Equilatero extends Triangulo {

    protected double lado1;

    public Equilatero() {
    }

    public Equilatero(double base, double altura, double lado1) {
        super(base, altura);
        this.lado1 = lado1;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double perimetro()
    {
        return lado1 + lado1 + lado1;
    }

    @Override
    public void leeDatos() {
        super.leeDatos();
        Menu.leeLado1();
        lado1 = ReadUtil.readDouble();
    }
}