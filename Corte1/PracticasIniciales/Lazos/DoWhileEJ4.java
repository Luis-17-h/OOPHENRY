
package dowhileej4;
import java.util.Scanner;

public class DoWhileEJ4 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        Scanner input = new Scanner(System.in);
    do {
        sum += number;
        System.out.println("Ingrese un numero");
        number = input.nextInt();
    } 
    while(number >= 0);
        System.out.println("Suma = " + sum);
    }
    
}
