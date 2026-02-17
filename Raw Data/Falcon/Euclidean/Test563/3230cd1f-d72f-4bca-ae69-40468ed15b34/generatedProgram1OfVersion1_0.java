public class FutureInvestmentValue {

    public static void main(String[] args) {
        double investmentAmount = 1000.0;
        double monthlyInterestRate = 0.05 / 12; // 5% annual interest rate
        int numberOfYears = 5;

        double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, numberOfYears);

        System.out.println("The future investment value is: $" + futureValue);
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numberOfYears) {
        int numberOfMonths = numberOfYears * 12;
        return investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfMonths);
    }
}
