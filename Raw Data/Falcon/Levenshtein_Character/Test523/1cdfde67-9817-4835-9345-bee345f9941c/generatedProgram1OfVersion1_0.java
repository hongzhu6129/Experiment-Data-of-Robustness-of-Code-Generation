public class FutureInvestmentValue {

    public static void main(String[] args) {
        double investmentAmount = 1000;
        double monthlyInterestRate = 0.05 / 12; // 5% annual interest rate
        int years = 5;

        double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
        System.out.println("Future value: $" + futureValue);


        investmentAmount = 2000;
        monthlyInterestRate = 0.075 / 12;  //7.5% annual interest rate
        years = 10;

        futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
        System.out.println("Future value: $" + futureValue);
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        int numberOfMonths = years * 12;
        return investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfMonths);
    }
}
