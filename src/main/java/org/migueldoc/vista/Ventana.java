package org.migueldoc.vista;

import org.gerdoc.historial.Historiales;
import org.gerdoc.vista.SolicitaDatos;
import org.migueldoc.model.cuadrilateros.Rectangulo;
import org.migueldoc.model.cuadrilateros.Rombo;
import org.migueldoc.model.figura.Circulo;
import org.migueldoc.model.figura.Cuadrado;
import org.migueldoc.model.figura.Figura;
import org.migueldoc.model.triangulos.Equilatero;
import org.migueldoc.model.triangulos.Escaleno;
import org.migueldoc.model.triangulos.Isosceles;
import org.migueldoc.util.ReadUtil;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame implements Ejecutable {
    private static Ventana ventana;
    private JComboBox<String> comboFigura;
    private JLabel[] labels;
    private JTextField[] textFields;
    private JButton calcularButton;
    private Historiales historiales;

    private enum FiguraType {
        CUADRADO("Cuadrado", 1),
        CIRCULO("Circulo", 1),
        ROMBO("Rombo", 3),
        RECTANGULO("Rectángulo", 2),
        EQUILATERO("Equilatero", 3),
        ISOSCELES("Isosceles", 4),
        ESCALENO("Escaleno", 5);

        private final String nombre;
        private final int camposRequeridos;

        FiguraType(String nombre, int camposRequeridos) {
            this.nombre = nombre;
            this.camposRequeridos = camposRequeridos;
        }

        public String getNombre() {
            return nombre;
        }

        public int getCamposRequeridos() {
            return camposRequeridos;
        }

        public static FiguraType fromNombre(String nombre) {
            for (FiguraType tipo : values()) {
                if (tipo.nombre.equals(nombre)) {
                    return tipo;
                }
            }
            throw new IllegalArgumentException("Figura no válida: " + nombre);
        }
    }

    private Ventana() {
        super("Programa de Figuras");
        init();
    }

    private void init() {
        getContentPane().setLayout(new GridLayout(0, 2, 10, 10)); // Usar GridLayout
        setBounds(100, 100, 400, 350);

        comboFigura = new JComboBox<>(new String[]{
                FiguraType.CUADRADO.getNombre(),
                FiguraType.CIRCULO.getNombre(),
                FiguraType.ROMBO.getNombre(),
                FiguraType.RECTANGULO.getNombre(),
                FiguraType.EQUILATERO.getNombre(),
                FiguraType.ISOSCELES.getNombre(),
                FiguraType.ESCALENO.getNombre()
        });
        getContentPane().add(new JLabel("Selecciona una figura:"));
        getContentPane().add(comboFigura);

        labels = new JLabel[5];
        textFields = new JTextField[5];
        for (int i = 0; i < 5; i++) {
            labels[i] = new JLabel();
            getContentPane().add(labels[i]);

            textFields[i] = new JTextField();
            getContentPane().add(textFields[i]);
        }

        calcularButton = new JButton("Calcular");
        getContentPane().add(calcularButton);

        comboFigura.addActionListener(e -> updateFields());
        calcularButton.addActionListener(e -> calcularFigura());

        updateFields();
    }

    private void updateFields() {
        FiguraType tipo = FiguraType.fromNombre((String) comboFigura.getSelectedItem());
        String[] etiquetas = getEtiquetas(tipo);

        for (int i = 0; i < labels.length; i++) {
            if (i < etiquetas.length) {
                labels[i].setText(etiquetas[i]);
                labels[i].setVisible(true);
                textFields[i].setVisible(true);
            } else {
                labels[i].setVisible(false);
                textFields[i].setVisible(false);
            }
        }
    }

    private String[] getEtiquetas(FiguraType tipo) {
        switch (tipo) {
            case CUADRADO:
                return new String[]{"Lado:"};
            case CIRCULO:
                return new String[]{"Radio:"};
            case ROMBO:
                return new String[]{"Diagonal Mayor:","Diagonal Menor:", "Lado:"};
            case RECTANGULO:
                return new String[]{"Base:", "Altura:"};
            case EQUILATERO:
                return new String[]{"Base:", "Altura:", "Lado:"};
            case ISOSCELES:
                return new String[]{"Base:", "Altura:", "Lado 1:", "Lado 2:"};
            case ESCALENO:
                return new String[]{"Base:", "Altura:", "Lado 1:", "Lado 2:", "Lado 3:"};
            default:
                throw new IllegalArgumentException("Tipo de figura no válido");
        }
    }

    private void calcularFigura() {
        FiguraType tipo = FiguraType.fromNombre((String) comboFigura.getSelectedItem());
        try {
            Figura figura = crearFigura(tipo);
            if (figura != null) {
                if (figura instanceof SolicitaDatos)
                {
                }

                JOptionPane.showMessageDialog(this, "Área: " + figura.area() + "\nPerímetro: " + figura.perimetro(),
                        "Resultados", JOptionPane.INFORMATION_MESSAGE);

                if (historiales != null) {
                    historiales.addFigura(figura);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error en los datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private Figura crearFigura(FiguraType tipo) {
        switch (tipo) {
            case CUADRADO:
                return new Cuadrado(Double.parseDouble(textFields[0].getText()));
            case CIRCULO:
                return new Circulo(Double.parseDouble(textFields[0].getText()));
            case ROMBO:
                return new Rombo(Double.parseDouble(textFields[0].getText()),
                        Double.parseDouble(textFields[1].getText()),
                        Double.parseDouble(textFields[2].getText()));
            case RECTANGULO:
                return new Rectangulo(Double.parseDouble(textFields[0].getText()),
                        Double.parseDouble(textFields[1].getText()));
            case EQUILATERO:
                return new Equilatero(Double.parseDouble(textFields[0].getText()),
                        Double.parseDouble(textFields[1].getText()), Double.parseDouble(textFields[2].getText()));
            case ISOSCELES:
                return new Isosceles(Double.parseDouble(textFields[0].getText()),
                        Double.parseDouble(textFields[1].getText()), Double.parseDouble(textFields[2].getText()),
                        Double.parseDouble(textFields[3].getText()));
            case ESCALENO:
                return new Escaleno(Double.parseDouble(textFields[0].getText()),
                        Double.parseDouble(textFields[1].getText()), Double.parseDouble(textFields[2].getText()),
                        Double.parseDouble(textFields[3].getText()), Double.parseDouble(textFields[4].getText()));
            default:
                throw new IllegalArgumentException("Tipo de figura no válido");
        }
    }

    public static Ventana getInstance() {
        if (ventana == null)
        {
            ventana = new Ventana();

        }
        return ventana;
    }


    @Override
    public void run() {
        setVisible(true);
    }

    @Override
    public void addHistoriales(Historiales historiales) {
        this.historiales = historiales;
    }
}