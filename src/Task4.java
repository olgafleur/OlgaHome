import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        double x = sc.nextDouble();

        if (x >= 0 && x <= 1) {

            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }
}