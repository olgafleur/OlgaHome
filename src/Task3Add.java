
import java.util.Scanner;

public class Task3Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

        int a = number / 100;
        int b = (number % 100) / 10;
        int c = number % 10;

        if (a == b && b == c) {
            System.out.println("all number are the same");
        } else {
            System.out.println("number are different");
        }
        if (a == b || b == c || c == a) {
            System.out.println("there are equal numbers");
        } else {
            System.out.println("there are no equal numbers");
        }
    }
}