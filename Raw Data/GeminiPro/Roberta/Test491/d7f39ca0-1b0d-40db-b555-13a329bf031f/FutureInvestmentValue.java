public class FutureInvestmentValue {

    public static void main(String[] args) {
        double investmentAmount = 1000;
        double monthlyInterestRate = 0.05 / 12; // 5% annual interest rate
        int numberOfYears = 5;

        double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, numberOfYears);
        System.out.println("Future investment value: " + futureValue);


        investmentAmount = 2000;
        monthlyInterestRate = 0.075 / 12; // 7.5% annual interest rate
        numberOfYears = 10;
        futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, numberOfYears);
        System.out.println("Future investment value: " + futureValue);


    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numberOfYears) {
        int numberOfMonths = numberOfYears * 12;
        return investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfMonths);
    }
}
