import java.util.InputMismatchException;
import java.util.Scanner;

public class Vista {
    private Scanner scanner = new Scanner(System.in);
    private OperacionesAvanzada operacion = new OperacionesAvanzada();
    private Areas areas = new Areas();

    public void mostrarMenu() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("===== CALCULADORA COMPLETA =====");
            System.out.println("1. Operaciones basicas y avanzadas");
            System.out.println("2. Calcular areas geometricas");
            System.out.println("3. Salir");

            int opcion = leerEntero("Selecciona una opcion: ");

            switch (opcion) {
                case 1:
                    menuOperaciones();
                    break;
                case 2:
                    menuAreas();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida.\n");
                    break;
            }
        }
    }

    // Menu Operaciones
    private void menuOperaciones() {
        operacion.setNumero1(leerNumero("Ingrese el primer numero: "));
        operacion.setNumero2(leerNumero("Ingrese el segundo numero: "));

        System.out.println("\nSeleccione una operacion:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potenciacion (n1 ^ n2)");
        System.out.println("6. Raiz cuadrada (solo de n1)");
        System.out.println("7. Factorial (solo de n1)");
        System.out.println("8. Volver");

        int opcion = leerEntero("Opcion: ");

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + operacion.sumar());
                break;
            case 2:
                System.out.println("Resultado: " + operacion.restar());
                break;
            case 3:
                System.out.println("Resultado: " + operacion.multiplicar());
                break;
            case 4:
                Double div = operacion.dividir();
                if (div != null)
                    System.out.println("Resultado: " + div);
                break;
            case 5:
                System.out.println("Resultado: " + operacion.potenciar());
                break;
            case 6:
                Double raiz = operacion.raizCuadrada();
                if (raiz != null)
                    System.out.println("Resultado: " + raiz);
                break;
            case 7:
                Double fact = operacion.factorial();
                if (fact != null)
                    System.out.println("Resultado: " + fact);
                break;
            case 8:
                return;
            default:
                System.out.println("Opcion no válida.");
                break;
        }

        System.out.println();
    }

    // Menu Areas
    private void menuAreas() {
        System.out.println("\n===== AREAS GEOMÉTRICAS =====");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Circunferencia");
        System.out.println("4. Triangulo rectangulo");
        System.out.println("5. Volver");

        int opcion = leerEntero("Opcion: ");

        switch (opcion) {
            case 1:
                double lado = leerNumero("Ingrese el lado: ");
                System.out.println("Area del cuadrado: " + areas.areaCuadrado(lado));
                break;
            case 2:
                double baseR = leerNumero("Ingrese la base: ");
                double alturaR = leerNumero("Ingrese la altura: ");
                System.out.println("Area del rectangulo: " + areas.areaRectangulo(baseR, alturaR));
                break;
            case 3:
                double radio = leerNumero("Ingrese el radio: ");
                System.out.println("Area de la circunferencia: " + areas.areaCircunferencia(radio));
                break;
            case 4:
                double baseT = leerNumero("Ingrese la base: ");
                double alturaT = leerNumero("Ingrese la altura: ");
                System.out.println("Area del triangulo rectangulo: " + areas.areaTrianguloRectangulo(baseT, alturaT));
                break;
            case 5:
                return;
            default:
                System.out.println("Opcion no valida.");
                break;
        }

        System.out.println();
    }

    private double leerNumero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: ingresa un numero valido.");
                scanner.next();
            }
        }
    }

    private int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: ingresa un numero entero.");
                scanner.next();
            }
        }
    }
}
