import java.util.Scanner;

public class Funding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the funding period (e.g., 2023Q1): ");
        String period = scanner.nextLine();

        System.out.print("Enter the funding amount (e.g., 100000): ");
        double amount = Double.parseDouble(scanner.nextLine());

        // Check if the period and amount are valid
        if (period == null || period.isEmpty()) {
            System.err.println("Invalid period: " + period);
            return;
        }
        if (amount <= 0) {
            System.err.println("Invalid amount: " + amount);
            return;
        }

        // Collect the funding
        System.out.println("Collecting " + amount + " for period " + period + "...");

        scanner.close();
    }
}
