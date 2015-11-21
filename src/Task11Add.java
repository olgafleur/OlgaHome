import java.util.Scanner;
public class Task11Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int x = sc.nextInt();

        if (x >= 10 && x <= 20) {
            System.out.println(x + " копеек" );}
        else if (x % 10 == 1 ) {
            System.out.println(x + " копейка");}
        else if ((x % 10 == 2) || (x % 10 == 3) || (x % 10 == 4)) {
            System.out.println(x + " копейки");}
        else if ((x % 10 == 5) || (x % 10 == 6) || (x % 10 == 7) || (x % 10 == 8) || (x % 10 == 9)) {
            System.out.println(x + " копеек");}
    }}
