package whilesumej2;
import java.util.Scanner;

public class WhileSumEj2 {

    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int number = input.nextInt();
    while (number >= 0) {
        sum += number;
        System.out.println("Ingrese un numero");
        number = input.nextInt();
 }
        System.out.println("Suma = " + sum);
    }
}
