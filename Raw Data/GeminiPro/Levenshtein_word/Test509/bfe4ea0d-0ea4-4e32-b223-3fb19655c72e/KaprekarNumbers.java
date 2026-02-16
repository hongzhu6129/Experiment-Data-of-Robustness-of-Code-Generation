import java.util.Arrays;

public class KaprekarNumbers {

    public static void main(String[] args) {
        int count = 0;
        System.out.println("Kaprekar Numbers less than 1000:");
        for (int i = 1; i < 1000; i++) {
            if (isKaprekar(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n" + count + " kaprekar numbers.");
    }

    public static boolean isKaprekar(int n) {
        if (n == 1) return true; // 1 is a Kaprekar number

        int square = n * n;
        String sqStr = String.valueOf(square);
        int numDigits = sqStr.length();

        for (int i = 1; i < numDigits; i++) {
            int rightPart = Integer.parseInt(sqStr.substring(i));
            int leftPart = Integer.parseInt(sqStr.substring(0, i));

            if (rightPart > 0 && (leftPart + rightPart) == n) {
                System.out.print(leftPart + " + " + rightPart + " ");
                return true;
            }

        }

        return false;
    }
}


