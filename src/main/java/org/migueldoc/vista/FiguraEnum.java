package org.migueldoc.vista;

public enum FiguraEnum {
    CUADRADO(1),
    EQUILATERO(2),
    ISOSCELES(3),
    ESCALENO(4),
    RECTANGULO(5),
    ROMBO(6),
    CIRCULO(7),
    SALIR(8),
    OPCION_ERRONEA(9);
    private Integer tipo;

    FiguraEnum(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public static FiguraEnum getFiguraEnumById( Integer id ){
        switch ( id ) {
            case 1:
                return CUADRADO;
            case 2:
                return EQUILATERO;
            case 3:
                return ISOSCELES;
            case 4:
                return ESCALENO;
            case 5:
                return RECTANGULO;
            case 6:
                return ROMBO;
            case 7:
                return CIRCULO;
            case 8:
                return SALIR;
            default:
                return OPCION_ERRONEA;
        }
    }
}
