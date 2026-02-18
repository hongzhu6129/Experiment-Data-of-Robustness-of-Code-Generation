import java.util.Scanner;

public class PartAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double partAverage = calculatePartAverage(num1, num2, num3);

        System.out.println("Part average: " + partAverage);
        scanner.close(); 
    }

    public static double calculatePartAverage(double num1, double num2, double num3) {
        // Calculate the sum of the two smallest numbers.
        double sumOfTwoSmallest = 0;
         if (num1 <= num2 && num1 <= num3) {
            sumOfTwoSmallest = (num2 <= num3) ? num1 + num2 : num1 + num3;
        } else if (num2 <= num1 && num2 <= num3) {
             sumOfTwoSmallest = (num1 <= num3) ? num1 + num2 : num2 + num3;
        } else { // num3 is smallest
             sumOfTwoSmallest = (num1 <= num2) ? num1 + num3 : num2 + num3;
        }
        return sumOfTwoSmallest / 2.0;
    }
}
