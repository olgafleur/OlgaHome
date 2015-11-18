import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double z = x / y;

        if (x % y == 0) {

            System.out.println("true. Result is " + z);
        }
        else {
            System.out.println("false. Result is " + x / y);

        }
    }
}