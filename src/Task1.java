import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();


        if (x >= 9 && x <= 18)
        {
            System.out.println("I am working");
        }

        else {
            System.out.println("I am at home");
        }
    }

}