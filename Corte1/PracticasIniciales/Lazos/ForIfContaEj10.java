package forifcontaej10;
import java.util.Scanner;

public class ForIfContaEj10 {
    public static void main(String[] args) {
        Double number, sum = 0.0;
        Scanner input = new Scanner(System.in);
    for (int i = 1; i < 6; ++i) {
        System.out.print("Ingrese un numero " + i + " : ");
        number = input.nextDouble();
    if (number <= 0.0) {
    continue;
        }
        sum += number;
    }
    System.out.println("Suma = " + sum);
    }
}
