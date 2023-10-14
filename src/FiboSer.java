import java.util.Scanner;

public class FiboSer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        // Check for invalid input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            printFibonacciSeries(n);
        }
    }

    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + "\t");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
