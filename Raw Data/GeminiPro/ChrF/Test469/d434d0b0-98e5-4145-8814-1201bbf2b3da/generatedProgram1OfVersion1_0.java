import java.util.Scanner;

public class LivingExpensesCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Income
        System.out.print("Enter your monthly salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter any other monthly income: ");
        double otherIncome = input.nextDouble();
        double totalIncome = salary + otherIncome;

        // Expenses
        System.out.print("Enter your monthly rent/mortgage: ");
        double rentMortgage = input.nextDouble();
        System.out.print("Enter your monthly utilities (water, electricity, etc.): ");
        double utilities = input.nextDouble();
        System.out.print("Enter your monthly grocery expenses: ");
        double groceries = input.nextDouble();
        System.out.print("Enter your monthly transportation costs: ");
        double transportation = input.nextDouble();
        System.out.print("Enter your monthly healthcare expenses: ");
        double healthcare = input.nextDouble();
        System.out.print("Enter other monthly expenses (entertainment, clothing, etc.):");
        double otherExpenses = input.nextDouble();

        double totalExpenses = rentMortgage + utilities + groceries + transportation + healthcare + otherExpenses;

        // Calculations and Output
        double netIncome = totalIncome - totalExpenses;

        System.out.println("\n--- Living Expenses Summary ---");
        System.out.printf("Total Monthly Income: $%.2f\n", totalIncome);
        System.out.printf("Total Monthly Expenses: $%.2f\n", totalExpenses);
        System.out.printf("Net Monthly Income (Savings/Remaining): $%.2f\n", netIncome);

        if (netIncome > 0) {
            System.out.println("You have a positive net income. Good job!");
        } else if (netIncome < 0) {
            System.out.println("You have a negative net income. Consider reviewing your expenses.");
        } else {
            System.out.println("Your income and expenses are balanced.");
        }

        input.close(); // Close the Scanner to prevent resource leaks
    }
}
