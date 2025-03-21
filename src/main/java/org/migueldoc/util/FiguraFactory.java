package org.migueldoc.util;

import org.migueldoc.model.cuadrilateros.Rectangulo;
import org.migueldoc.model.cuadrilateros.Rombo;
import org.migueldoc.model.figura.Circulo;
import org.migueldoc.model.figura.Cuadrado;
import org.migueldoc.model.figura.Figura;
import org.migueldoc.model.triangulos.Equilatero;
import org.migueldoc.model.triangulos.Escaleno;
import org.migueldoc.model.triangulos.Isosceles;
import org.migueldoc.vista.FiguraEnum;

public class FiguraFactory {


        public static Figura getFiguraByFiguraEnum(FiguraEnum figuraEnum )
        {
            switch (figuraEnum)
            {
                case CUADRADO:
                    return new Cuadrado( );
                case EQUILATERO:
                    return new Equilatero( );
                case ISOSCELES:
                    return new Isosceles( );
                case ESCALENO:
                    return new Escaleno( );
                case RECTANGULO:
                    return new Rectangulo();
                case ROMBO:
                    return new Rombo();
                case CIRCULO:
                    return new Circulo();
                case OPCION_ERRONEA:
                case SALIR:
                default:
                    return null;
            }
        }
    }
