package org.migueldoc.model.cuadrilateros;
import org.migueldoc.model.figura.Cuadrado;
import org.migueldoc.util.ReadUtil;
import org.migueldoc.vista.Menu;

public class Rombo extends Cuadrado {
    private double diagonalMayor;
    private double diagonalMenor;
    public Rombo() {
    }
    public Rombo(double lado1, double diagonalMayor, double diagonalMenor) {
        super(lado1);
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }
    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }
    public double getDiagonalMenor() {
        return diagonalMenor;
    }
    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
    public double perimetro()
    {
        return lado1 * 4;
    }
    public double area()
    {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    @Override
    public void leeDatos() {
        super.leeDatos();
        Menu.leeDiagonalMayor();
        diagonalMayor = ReadUtil.readDouble();
        Menu.leeDiagonalMenor();
        diagonalMenor = ReadUtil.readDouble();
    }
}