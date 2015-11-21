import java.util.Scanner;

public class Task1Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tree numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2)) {
            System.out.println("Треугольник равносторонний");
        } else {
            System.out.println("Треугольник неравносторонний");
        }
    }
}
