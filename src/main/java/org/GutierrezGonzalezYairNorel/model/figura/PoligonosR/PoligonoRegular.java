package org.GutierrezGonzalezYairNorel.model.figura.PoligonosR;

import org.GutierrezGonzalezYairNorel.model.figura.Figura;
import org.GutierrezGonzalezYairNorel.util.ReadUtil;
import org.GutierrezGonzalezYairNorel.vista.Menu;

public class PoligonoRegular extends Figura {
    protected double lado;
    protected int nLados;

    public PoligonoRegular(double lado, int nLados) {
        if (lado <= 0 || nLados < 3) {
            throw new IllegalArgumentException("El lado debe ser positivo y " +
                    "el número de lados debe ser al menos 3.");
        }
        this.lado = lado;
        this.nLados = nLados;
    }

    public PoligonoRegular() {
        this(1.0, 3);
    }

    @Override
    public double area() {
        return (nLados * lado * lado) / (4 * Math.tan(Math.PI / nLados));
    }

    @Override
    public double perimetro() {
        return lado * nLados;
    }

    @Override
    public void leeDatos() {
        do {
            Menu.leeLado();
            lado = ReadUtil.readDouble();
        } while (lado <= 0);

        do {
            Menu.leenLados();
            nLados = ReadUtil.readInt();
        } while (nLados < 3);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado debe ser positivo.");
        }
        this.lado = lado;
    }

    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        if (nLados < 3) {
            throw new IllegalArgumentException("El número de lados debe ser al menos 3.");
        }
        this.nLados = nLados;
    }
}