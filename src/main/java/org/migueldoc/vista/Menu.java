package org.migueldoc.vista;

import org.migueldoc.model.figura.Figura;

public class Menu {
    public static void principal2() {
        System.out.println("*********************************************");
        System.out.println(" ***** Bienvenido *****");
        System.out.println(" -- SELECCIONA UNA OPCION -- ");
        System.out.println(" *** PROGRAMA DE FIGURAS ***");
        System.out.println("1.- CONSOLA");
        System.out.println("2.- VENTANA");
        System.out.println("3.- HISTORIAL");
        System.out.println("4.- SALIR DEL PROGRAMA");
    }

    public static void principaMenu() {
        System.out.println("*********************************************");
        System.out.println(" ***** Bienvenido *****");
        System.out.println(" *** PROGRAMA DE FIGURAS ***");
        System.out.println(" -- SELECCIONA UNA OPCION -- " +
                "\n1.- CUADRADRO" +
                "\n2.- EQUILATERO" +
                "\n3.- ISOSCELES" +
                "\n4.- ESCALEN0O" +
                "\n5.- RECTANGULO" +
                "\n6.- ROMBO" +
                "\n7.- CIRCULO" +
                "\n8.- SALIR DEL PROGRAMA");

    }

    public static void menuTriangulo() {
        System.out.println("*********************************************");
        System.out.println(" -- SELECCIONA UNA OPCION -- " +
                "\n1.- EQUILATERO" +
                "\n2.- ISOSCELES" +
                "\n3.- ESCALENO" +
                "\n4.- SALIR DEl PROGRAMA ");
    }

    public static void opcionInvalida() {
        System.out.println(" *** LA OPCIÓN NO ES CORRECTA *** ");

    }

    public static void seleccionaOpcion() {
        System.out.print(" *** DAME UNA OPCIÓN : ");
    }

    public static void errorDato() {
        System.out.println(" *** NO ES UN DATO VALIDO *** ");
    }

    public static void leeLado() {
        estrellitas();
        System.out.print("Dame un Lado  :  ");
    }

    public static void leeBase() {
        estrellitas();
        System.out.print("Dame la Base  : ");
    }

    public static void leeAltura() {
        estrellitas();
        System.out.print("Dame la Altura  : ");
    }

    public static void leeLado1() {
        estrellitas();
        System.out.print("Dame el Valor del Primer Lado : ");
    }

    public static void leeLado2() {
        estrellitas();
        System.out.print("Dame el Valor del Segundo Lado : ");
    }

    public static void leeLado3() {
        estrellitas();
        System.out.print("Dame el Valor del Tercer Lado : ");
    }

    public static void leeDiagonalMenor() {
        estrellitas();
        System.out.print("Dame el Valor de la Diagonal Mayor : ");
    }

    public static void leeDiagonalMayor() {
        estrellitas();
        System.out.print("Dame el Valor de la Diagonal Menor : ");
    }

    public static void leeRadio() {
        estrellitas();
        System.out.print("Dame el Valor del Radio : ");
    }

    public static void calcular(Figura figura) {
        System.out.println("*********************************************");
        System.out.println("El Area es: " + figura.area());
        System.out.println("El Perimetro es: " + figura.perimetro());
    }

    public static void despidada() {
        System.out.println("*****************************");
        System.out.println("Tenga Un Buen Día");
        System.out.println("*****************************");
    }

    public static void estrellitas(){
        System.out.println("*************************************");
    }

}

