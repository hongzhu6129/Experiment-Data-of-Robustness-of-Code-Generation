public class FutureInvestmentValue {

    public static void main(String[] args) {
        double investmentAmount = 1000.0;
        double annualInterestRate = 3.5; // Percentage
        int numberOfYears = 10;

        double futureValue = futureInvestmentValue(investmentAmount, annualInterestRate, numberOfYears);

        System.out.println("The future investment value is $" + futureValue);

        // Example with different inputs:
        investmentAmount = 2000.0;
        annualInterestRate = 4.25; // Percentage
        numberOfYears = 5;

        futureValue = futureInvestmentValue(investmentAmount, annualInterestRate, numberOfYears);

        System.out.println("The future investment value is $" + futureValue);
    }

    public static double futureInvestmentValue(double investmentAmount, double annualInterestRate, int numberOfYears) {
        double monthlyInterestRate = annualInterestRate / 1200.0; // Divide by 100 for percentage and 12 for monthly
        int numberOfMonths = numberOfYears * 12;

        return investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfMonths);
    }
}
