public class FutureInvestmentValue {

    public static void main(String[] args) {
        double investmentAmount = 1000.0;
        double monthlyInterestRate = 0.05 / 12; // 5% annual interest
        int years = 5;

        double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
        System.out.println("Future value is $" + futureValue);

        // Example 2
        investmentAmount = 2000.0;
        monthlyInterestRate = 0.075 / 12; // 7.5% annual interest
        years = 10;

        futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
        System.out.println("Future value is $" + futureValue);

        // You can add more test cases here...
    }



    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        int numberOfMonths = years * 12;
        return investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfMonths);
    }
}
