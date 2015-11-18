import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int sum = x + y;

        if (sum >= 11 && sum <= 19)
        {
            System.out.println(sum);
        }

        else {
            System.out.println("incorrect");
        }


    }
}
 