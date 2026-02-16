public class FutureInvestmentValue {

    public static void main(String[] args) {
        double investmentAmount = 1000.0;
        double monthlyInterestRate = 0.05 / 12; // 5% annual rate
        int numberOfMonths = 36;

        double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, numberOfMonths);
        System.out.println("Accumulated value is $" + futureValue);


        investmentAmount = 2000;
        monthlyInterestRate = 0.06 /12;
        numberOfMonths = 12;
        futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, numberOfMonths);

        System.out.println("Accumulated value is $" + futureValue);
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numberOfMonths) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfMonths);
    }
}
