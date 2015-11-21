import java.util.Scanner;

public class Task2Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tree numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x > 0 || y > 0 || z > 0) {
            System.out.println(Math.pow(x, 3) + ", " + Math.pow(y, 3) + ", " + Math.pow(z, 3));
        } else if (x < 0 || y < 0 || z < 0) {
            System.out.println((x = 0) + ", " + (y = 0) + ", " + (z = 0));
        }
    }
}
