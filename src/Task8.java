import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x % 10 == y) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

