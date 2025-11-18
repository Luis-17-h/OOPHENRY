package vista;

import controlador.Controlador;
import javax.swing.*;
import java.awt.*;

public class Vista extends JFrame {

    private JTextField campoNum1;
    private JTextField campoNum2;
    private JComboBox<String> opcionesOperacion;
    private JButton botonCalcular;
    private JLabel etiquetaResultado;

    private Controlador controlador;

    public Vista() {
        super("Calculadora M.D.P");

        controlador = new Controlador(this);

        configurarVentana();
        inicializarComponentes();
        agregarComponentes();
        agregarEventos();

        setVisible(true);
    }

    private void configurarVentana() {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1, 5, 5));
        setLocationRelativeTo(null);
    }

    private void inicializarComponentes() {
        campoNum1 = new JTextField();
        campoNum2 = new JTextField();

        opcionesOperacion = new JComboBox<>();
        opcionesOperacion.addItem("Multiplicacion");
        opcionesOperacion.addItem("Division");
        opcionesOperacion.addItem("Potenciacion");

        botonCalcular = new JButton("Calcular");

        etiquetaResultado = new JLabel("Resultado: ", SwingConstants.CENTER);
    }

    private void agregarComponentes() {
        add(new JLabel("Numero 1:", SwingConstants.CENTER));
        add(campoNum1);

        add(new JLabel("Numero 2:", SwingConstants.CENTER));
        add(campoNum2);

        add(opcionesOperacion);
        add(botonCalcular);
        add(etiquetaResultado);
    }

    private void agregarEventos() {
        botonCalcular.addActionListener(e -> controlador.procesarOperacion());
    }


    public int getNumero1() {
        return Integer.parseInt(campoNum1.getText());
    }

    public int getNumero2() {
        return Integer.parseInt(campoNum2.getText());
    }

    public String getOperacion() {
        return (String) opcionesOperacion.getSelectedItem();
    }

    public void mostrarResultado(int resultado) {
        etiquetaResultado.setText("Resultado: " + resultado);
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}