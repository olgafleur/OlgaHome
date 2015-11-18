import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x > y && x > z && y > z)
        {
            System.out.println("max = " + x + " and " + " min = " + z);
        }

        if (x > y && x > z && z > y)
        {
            System.out.println("max = " + x + " and " + " min = " + y);
        }

        if (y > x && y > z && x > z)
        {
            System.out.println("max = " + y + " and " + " min = " + z);
        }

        if (y > x && y > z && z > x)
        {
            System.out.println("max = " + y + " and " + " min = " + x);
        }

        if (z > x && z > y && x > y)
        {
            System.out.println("max = " + z + " and " + " min = " + y);
        }

        if (z > x && z > y && y > x)
        {
            System.out.println("max = " + z + " and " + " min = " + x);
        }

        else {
            System.out.println(" ");
        }




    }
}
 