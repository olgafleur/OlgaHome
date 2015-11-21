import java.util.Scanner;
public class Task7Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month: ");
        int number = sc.nextInt();

        if (number == 12 || number == 1 || number == 2) {System.out.println("Winter");}
        else if (number == 3 || number == 4 || number == 5) {System.out.println("Spring");}
        else if (number == 6 || number == 7 || number == 8) {System.out.println("Summer");}
        else if (number == 9 || number == 10 || number == 11) {System.out.println("Autumn");}
        else {System.out.println("incorrect number");}}}