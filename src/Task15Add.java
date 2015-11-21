import java.util.Scanner;

public class Task15Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите площадь круга: ");
        int krug = sc.nextInt();
        System.out.println("Введите площадь квадрата: ");
        int kvadrat = sc.nextInt();

        if ((2 * (Math.sqrt(krug / 3.14))) < (Math.sqrt(kvadrat))) {
            System.out.println("влезет");
        }
    }
}