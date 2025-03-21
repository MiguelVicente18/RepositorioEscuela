package org.GutierrezGonzalezYairNorel.model.figura;
import org.GutierrezGonzalezYairNorel.util.ReadUtil;
import org.GutierrezGonzalezYairNorel.vista.Menu;

public abstract class Triangulo extends Figura {
    protected double base;
    protected double altura;

    public Triangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("La base y la altura deben ser positivas.");
        }
        this.base = base;
        this.altura = altura;
    }
    public Triangulo() {
        this(1.0, 1.0); // Valores por defecto
    }
    @Override
    public double area() {
        return (base * altura) / 2;
    }
    @Override
    public void leeDatos() {
        do {
            Menu.leeBase();
            base = ReadUtil.readDouble();
        } while (base <= 0);

        do {
            Menu.leeAltura();
            altura = ReadUtil.readDouble();
        } while (altura <= 0);
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("La base debe ser positiva.");
        }
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser positiva.");
        }
        this.altura = altura;
    }
}