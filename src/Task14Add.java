import java.util.Scanner;

public class Task14Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

        int a = number / 100000;
        int b = (number / 10000) % 10;
        int c = (number / 1000) % 10;
        int d = (number % 1000) / 100;
        int e = (number % 100) / 10;
        int f = (number % 10);

        if ((a + b + c) == (d + e + f)) {
            System.out.println("счастливый");
        }
    }
}