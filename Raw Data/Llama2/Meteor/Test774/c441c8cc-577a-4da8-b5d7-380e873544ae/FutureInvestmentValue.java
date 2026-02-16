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

        input.close(); 
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double monthlyInterestRateDecimal = monthlyInterestRate / 1200.0; // Convert percentage to decimal and divide by 12
        int numberOfMonths = years * 12;
        return investmentAmount * Math.pow(1 + monthlyInterestRateDecimal, numberOfMonths);
    }
}
