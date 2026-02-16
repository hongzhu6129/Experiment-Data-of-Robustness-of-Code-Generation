public class FutureInvestmentValue {

    public static void main(String[] args) {
        double investmentAmount = 1000.0;
        double monthlyInterestRate = 0.05 / 12; // Annual rate divided by 12
        int numberOfMonths = 36;

        double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, numberOfMonths);

        System.out.println("The future investment value is: $" + futureValue);

    }


    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numberOfMonths) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfMonths);
    }
}
