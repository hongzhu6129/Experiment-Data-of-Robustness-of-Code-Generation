public class FutureInvestment {

    public static void main(String[] args) {
        double investmentAmount = 1000;
        double monthlyInterestRate = 0.05 / 12; // 5% annual interest rate
        int years = 5;

        double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
        System.out.println("Accumulated value is $" + futureValue); 
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        int numberOfMonths = years * 12;
        return investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfMonths);
    }
}
