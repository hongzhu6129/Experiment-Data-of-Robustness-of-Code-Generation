public class FutureInvestmentValue {

    public static void main(String[] args) {
        double investmentAmount = 1000.0;
        double monthlyInterestRate = 0.05 / 12; // 5% annual interest
        int numberOfYears = 10;

        double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, numberOfYears);

        System.out.println("Future value is $" + futureValue);


        investmentAmount = 2000;
        monthlyInterestRate = 0.075/12;
        numberOfYears = 20;

        futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, numberOfYears);

        System.out.println("Future value is $" + futureValue);
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numberOfYears) {
        int numberOfMonths = numberOfYears * 12;
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfMonths);
        return futureValue;
    }
}
