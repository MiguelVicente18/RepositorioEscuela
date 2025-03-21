package org.migueldoc.model.figura;
import org.migueldoc.util.ReadUtil;
import org.migueldoc.vista.Menu;

public abstract class Triangulo extends Figura {
    protected double base;
    protected double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double area() {
        return base*altura/2;
    }

    @Override
    public void leeDatos() {
        Menu.leeBase();
        base = ReadUtil.readDouble();
        Menu.leeAltura();
        altura = ReadUtil.readDouble();
    }
}