import java.util.Scanner;

public class Task13Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x > 0 || y > 0 || z > 0) {
            System.out.println((x * 2) + " ," + (y * 2) + " ," + (z * 2));
        } else {
            System.out.println((x = 0) + (y = 0) + (z = 0));
        }
    }
}
