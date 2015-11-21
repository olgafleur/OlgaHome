import java.util.Scanner;

public class Task12Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter wind speed: ");
        int x = sc.nextInt();

        if (x >= 1 && x <= 4) {
            System.out.println("Ветер слабый");
        } else if (x >= 5 && x <= 10) {
            System.out.println("Ветер умеренный");
        } else if (x >= 11 && x <= 18) {
            System.out.println("Ветер сильный");
        } else if (x >= 19) {
            System.out.println("Ветер ураганный");
        }
    }
}
