import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a no. for multiplication table: ");
        int number = scanner.nextInt();

        System.out.print("Enter range: ");
        int range = scanner.nextInt();

        System.out.println("Multiplication table for " + number + " up to " + range + " is:");

        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
