import java.util.ArrayList;
import java.util.List;

public class KeithNumber {

    public static void main(String[] args) {
        int num = 197; // Example Keith number
        //int num = 123; // Example non-Keith number


        if (isKeithNumber(num)) {
            System.out.println(num + " is a Keith number.");
        } else {
            System.out.println(num + " is not a Keith number.");
        }
    }

    public static boolean isKeithNumber(int num) {
        List<Integer> terms = new ArrayList<>();
        int temp = num;
        String numStr = String.valueOf(num);
        int numDigits = numStr.length();

        // Initialize the sequence with the digits of the number
        for (int i = 0; i < numDigits; i++) {
            terms.add(temp % 10);
            temp /= 10;
        }


        int nextTerm = 0;
        while (nextTerm < num) {
            nextTerm = 0;
            for (int i = 0; i < numDigits; i++) {
                nextTerm += terms.get(terms.size() - 1 - i);
            }

            terms.add(nextTerm);

            if (nextTerm == num) {
                return true;
            }
        }


        return false;
    }
}
