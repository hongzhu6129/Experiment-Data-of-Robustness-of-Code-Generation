public class FutureInvestmentValue {

    public static void main(String[] args) {
        double investmentAmount = 1000;
        double monthlyInterestRate = 0.05 / 12; // 5% annual interest rate
        int numberOfYears = 5;

        double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, numberOfYears);
        System.out.println("Future investment value: $" + futureValue);

        // Additional examples
        System.out.println("Future investment value: $" + futureInvestmentValue(2000, 0.06/12, 10));
        System.out.println("Future investment value: $" + futureInvestmentValue(5000, 0.03/12, 3));

    }


    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numberOfYears) {
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        return futureValue;
    }
}
