import java.util.Scanner;

public class Task9Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter height: ");
        int x = sc.nextInt();
        System.out.println("Please enter weight: ");
        int y = sc.nextInt();

        if ((x - 100) >= (y)) {
            System.out.println("you are slim");
        } else System.out.println("you are fat"); }}