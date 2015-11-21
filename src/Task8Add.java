import java.util.Scanner;

public class Task8Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int x = sc.nextInt();

        if (x < 1000) {
            System.out.println("Price is " + x);
        } else if (x >= 1000) {
            System.out.println("Price with discount is " + (x - (x * 0.10)));
        }

    }
}

