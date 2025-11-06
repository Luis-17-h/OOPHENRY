package controlador;

import modelo.*;
import vista.Vista;

public class Controlador {
    private Vista vista;

    public Controlador(Vista vista) {
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;

        do {
            opcion = vista.mostrarMenu();

            if (opcion == 4) {
                vista.mostrarMensaje("Saliendo...");
                break;
            }

            int n1 = vista.leerNumero("Ingrese el primer numero: ");
            int n2 = vista.leerNumero("Ingrese el segundo numero: ");
            Operacion operacion;
            int resultado;

            try {
                switch (opcion) {
                    case 1:
                        operacion = new Multiplicacion(n1, n2);
                        resultado = operacion.calcular();
                        vista.mostrarResultado(resultado);
                        break;
                    case 2:
                        operacion = new Division(n1, n2);
                        resultado = operacion.calcular();
                        vista.mostrarResultado(resultado);
                        break;
                    case 3:
                        operacion = new Potenciacion(n1, n2);
                        resultado = operacion.calcular();
                        vista.mostrarResultado(resultado);
                        break;
                    default:
                        vista.mostrarMensaje("Opción inválida");
                }
            } catch (Exception e) {
                vista.mostrarMensaje("Error: " + e.getMessage());
            }

        } while (opcion != 4);
    }
}
