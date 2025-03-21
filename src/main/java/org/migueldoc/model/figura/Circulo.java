package org.migueldoc.model.figura;

import org.migueldoc.util.ReadUtil;
import org.migueldoc.vista.Menu;

public class Circulo extends Figura {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * Math.pow(radio,2);
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void leeDatos() {
        Menu.leeRadio();
        radio = ReadUtil.readDouble();
    }
}