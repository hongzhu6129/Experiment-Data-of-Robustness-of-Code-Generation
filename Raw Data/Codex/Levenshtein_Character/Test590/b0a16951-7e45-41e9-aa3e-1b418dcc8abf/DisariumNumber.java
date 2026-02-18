import java.util.Scanner;

public class DisariumNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isDisarium(num)) {
            System.out.println(num + " is a Disarium number.");
        } else {
            System.out.println(num + " is not a Disarium number.");
        }
       
        scanner.close(); 
    }

    public static boolean isDisarium(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
            numDigits--;
        }

        return sum == originalNum;
    }
}
