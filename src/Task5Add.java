import java.util.Scanner;

public class Task5Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x == y || y == z || z == x) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
