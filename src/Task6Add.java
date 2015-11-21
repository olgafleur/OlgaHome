import java.util.Scanner;

public class Task6Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance: ");
        float x = sc.nextFloat();
        System.out.println("Enter speed: ");
        float y = sc.nextFloat();
        float z = x / y;

        System.out.printf("Your destination time is %,.2f hours", z);
    }
}





