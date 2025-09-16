import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        // Input annual interest rate (in percentage)
        System.out.print("Enter annual interest rate (in %): ");
        double rate = scanner.nextDouble();

        // Input number of times interest is compounded per year
        System.out.print("Enter number of times interest is compounded per year: ");
        int n = scanner.nextInt();

        // Input number of years
        System.out.print("Enter number of years: ");
        int t = scanner.nextInt();

        // Calculate compound interest
        double amount = principal * Math.pow(1 + (rate / 100) / n, n * t);
        double compoundInterest = amount - principal;

        // Display result
        System.out.printf("Compound Interest = %.2f\n", compoundInterest);
        System.out.printf("Total Amount = %.2f\n", amount);

        scanner.close();
    }
}
