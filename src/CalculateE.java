public class CalculateE {
    public static void main(String[] args) {
        int n = 5; // Number of terms to calculate
        double e = calculateE(n);
        System.out.println("Value of 'e' with " + n + " terms: " + e);
    }

    public static double calculateE(int n) {
        double e = 1.0; // Initialize 'e' to 1 (the first term)

        // Calculate e using the formula e = 1 + 1/2! + 1/3! + ...
        for (int i = 1; i <= n; i++) {
            e += 1.0 / factorial(i);
        }

        return e;
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 2; i <= num; i++) {
                result *= i;
            }
            return result;
        }
    }
}
