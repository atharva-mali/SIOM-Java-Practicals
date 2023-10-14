import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter Employee Number: ");
        int empNo = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Constants
        double DA_PERCENTAGE = 50.0;
        double HRA_PERCENTAGE = 25.0;
        double CCA = 240.0;
        double PF_PERCENTAGE = 10.0;
        double PT = 100.0;

        // Calculate components
        double da = (DA_PERCENTAGE / 100) * basicSalary;
        double hra = (HRA_PERCENTAGE / 100) * basicSalary;
        double pf = (PF_PERCENTAGE / 100) * basicSalary;

        // Calculate gross salary
        double grossSalary = basicSalary + da + hra + CCA;

        // Calculate net salary
        double netSalary = grossSalary - pf - PT;

        // Output
        System.out.println("Employee Number: " + empNo);
        System.out.println("Employee Name: " + empName);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);

        scanner.close();
    }
}
