import java.math.BigDecimal;
import java.util.Scanner;

public class AverageCalculatorImproved {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");

        BigDecimal num1 = input.nextBigDecimal();
        BigDecimal num2 = input.nextBigDecimal();
        BigDecimal num3 = input.nextBigDecimal();

        BigDecimal average = calculateAverage(num1, num2, num3);

        System.out.println("The average is: " + average);
        input.close();
    }

    public static BigDecimal calculateAverage(BigDecimal num1, BigDecimal num2, BigDecimal num3) {
        BigDecimal sum = num1.add(num2).add(num3);
        return sum.divide(new BigDecimal("3"), 10, BigDecimal.ROUND_HALF_UP); // Adjust precision as needed
    }
}
