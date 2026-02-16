public class FutureInvestmentValue {

    public static void main(String[] args) {
        double investmentAmount = 1000.0;
        double monthlyInterestRate = 0.05 / 12; // 5% annual interest rate
        int numberOfYears = 5;

        double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, numberOfYears);

        System.out.println("Accumulated value is $" + futureValue);


        investmentAmount = 1000.0;
        monthlyInterestRate = 0.06 / 12; // 6% annual interest rate
        numberOfYears = 6;
        futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, numberOfYears);
         System.out.println("Accumulated value is $" + futureValue);

         // Add more test cases as needed...
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numberOfYears) {
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        return futureValue;
    }
}
