import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KaprekarNumbers {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if (isKaprekar(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n" + count + " kaprekar numbers.");
    }


    private static boolean isKaprekar(int n) {
        if (n == 1) return true;  // 1 is a Kaprekar number

        long square = (long) n * n;
        String sqrStr = String.valueOf(square);
        int numDigits = sqrStr.length();


        for (int i = 1; i < numDigits; i++) {
            long rightPart = Long.parseLong(sqrStr.substring(i));
            long leftPart = Long.parseLong(sqrStr.substring(0, i));

            if (rightPart > 0 && (leftPart + rightPart) == n) {

                System.out.print(leftPart + " + " + rightPart + " ");
                return true;
            }
        }

        return false;

    }
}
