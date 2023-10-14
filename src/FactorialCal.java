import java.util.Scanner;

public class FactorialCal {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial undefined for negative nos.");
        } else {
            long factorial = calculateFactorial(num);
            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        scanner.close();
    }

    // Recursive function to calculate factorial
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
