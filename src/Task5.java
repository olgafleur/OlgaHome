import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();


        if (x > y) {
            System.out.println(x - y);
        }
        else if (y > x) {
            System.out.println(x += y);
        }
    }
}

