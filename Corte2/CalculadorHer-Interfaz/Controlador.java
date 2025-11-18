package controlador;

import modelo.*;
import vista.Vista;

public class Controlador {

    private Vista vista;

    public Controlador(Vista vista) {
        this.vista = vista;
    }

    public void procesarOperacion() {
        try {
            int n1 = vista.getNumero1();
            int n2 = vista.getNumero2();
            String oper = vista.getOperacion();

            Operacion op;

            switch (oper) {
                case "Multiplicación":
                    op = new Multiplicacion(n1, n2);
                    break;

                case "División":
                    op = new Division(n1, n2);
                    break;

                case "Potenciación":
                    op = new Potenciacion(n1, n2);
                    break;

                default:
                    vista.mostrarError("Operación no válida.");
                    return;
            }

            int resultado = op.calcular();
            vista.mostrarResultado(resultado);

        } catch (NumberFormatException e) {
            vista.mostrarError("Ingrese valores numéricos enteros válidos.");
        } catch (Exception e) {
            vista.mostrarError(e.getMessage());
        }
    }
}