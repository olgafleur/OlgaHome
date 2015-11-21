import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x > y && y > z) {System.out.println("max = " + x + " and " + " min = " + z);
        } else if (x > y && z > y) {System.out.println("max = " + x + " and " + " min = " + y);
        } else if (y > x && x > z) {System.out.println("max = " + y + " and " + " min = " + z);
        } else if (y > x && z > x) {System.out.println("max = " + y + " and " + " min = " + x);
        } else if (z > x && x > y) {System.out.println("max = " + z + " and " + " min = " + y);
        } else if (z > x && y > x) {System.out.println("max = " + z + " and " + " min = " + x);
        } else {System.out.println(" ");
        }
    }
}

