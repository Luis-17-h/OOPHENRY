import java.util.InputMismatchException;
import java.util.Scanner;

public class Vista {
     private Scanner scanner = new Scanner(System.in);
    private Operaciones operacion = new Operaciones();

    public void mostrarMenu() {
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("===== CALCULADORA =====");
                System.out.print("Ingrese el primer numero: ");
                operacion.setNumero1(scanner.nextDouble());

                System.out.print("Ingrese el segundo numero: ");
                operacion.setNumero2(scanner.nextDouble());

                System.out.println("\nSeleccione una operacion:");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.print("Opcion: ");
                int opcion = scanner.nextInt();

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
                        System.out.println("Resultado: " + operacion.dividir());
                        break;
                    case 5:
                        continuar = false;
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un numero valido.");
                scanner.nextLine();
            }
            System.out.println();
        }
    }
}
