package org.migueldoc.model.figura;

import org.migueldoc.util.ReadUtil;
import org.migueldoc.vista.Menu;

public class Cuadrado extends Figura {

    protected double lado1;

    public Cuadrado() {
    }

    public Cuadrado(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    @Override
    public double area() {
        return lado1*lado1;
    }

    @Override
    public double perimetro() {
        return lado1 * 4;
    }

    @Override
    public void leeDatos() {
        Menu.leeLado();
        lado1 = ReadUtil.readDouble();
    }

}