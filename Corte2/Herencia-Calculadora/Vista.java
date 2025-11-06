package vista;

import java.util.Scanner;

public class Vista {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== CALCULADORA M.D.P ===");
        System.out.println("1. Multiplicacion");
        System.out.println("2. Division");
        System.out.println("3. Potenciacion");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opcion: ");
        return sc.nextInt();
    }

    public int leerNumero(String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public void mostrarResultado(int resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

}
