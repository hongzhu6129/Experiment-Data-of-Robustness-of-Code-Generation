public class FutureInvestmentValue {

    public static void main(String[] args) {
        double investmentAmount = 1000.0;
        double monthlyInterestRate = 0.05 / 12; // 5% annual interest rate
        int numberOfYears = 5;

        double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, numberOfYears);
        System.out.println("Accumulated value is $" + futureValue);


        investmentAmount = 2000;
        monthlyInterestRate = 0.03/12; //3% annual interest
        numberOfYears = 1;
        futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, numberOfYears);
        System.out.println("Accumulated value is $" + futureValue);


    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numberOfYears) {
        int numberOfMonths = numberOfYears * 12;
        return investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfMonths);
    }
}
