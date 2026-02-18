import java.util.Scanner;

public class FutureInvestmentValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();

        double futureValue = futureInvestmentValue(investmentAmount, annualInterestRate, numberOfYears);

        System.out.printf("Future value is $%.2f\n", futureValue);

        input.close(); // Close the scanner
    }

    public static double futureInvestmentValue(double investmentAmount, double annualInterestRate, int numberOfYears) {
        double monthlyInterestRate = annualInterestRate / 1200; // Convert annual rate to monthly and decimal
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        return futureValue;
    }
}
