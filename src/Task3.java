import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();

        if (x % 7 == 0)
        {
            System.out.println(x*2);
        }

        else {
            System.out.println("");
        }
    }
}