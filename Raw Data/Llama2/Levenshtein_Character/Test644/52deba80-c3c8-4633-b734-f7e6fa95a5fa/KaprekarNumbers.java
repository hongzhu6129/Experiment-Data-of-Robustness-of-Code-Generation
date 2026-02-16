import java.util.ArrayList;
import java.util.List;

public class KaprekarNumbers {

    public static void main(String[] args) {
        List<Integer> kaprekarNumbers = new ArrayList<>();
        for (int i = 1; i < 1000; i++) {
            if (isKaprekar(i)) {
                kaprekarNumbers.add(i);
            }
        }

        System.out.print(kaprekarNumbers.size() + " kaprekar numbers."); // Print the count

        for (int num : kaprekarNumbers) {  // Print the numbers and their splits
            long square = (long) num * num;
            String sqStr = String.valueOf(square);
            int numDigits = String.valueOf(num).length();

            String[] parts = split_num(sqStr, numDigits);
           
            System.out.print(num + " " + square + " " + parts[0] + " + " + parts[1]);


        }


    }

    private static boolean isKaprekar(int num) {
        long square = (long) num * num;
        String sqStr = String.valueOf(square);
        int numDigits = String.valueOf(num).length();

        String[] parts = split_num(sqStr, numDigits);

        if (parts[1].equals("0")) return false; //avoid "0"

        try {
            int num1 = Integer.parseInt(parts[0]);
            int num2 = Integer.parseInt(parts[1]);
            return num1 + num2 == num;
        } catch (NumberFormatException e) {
            return false;
        }


    }

    private static String[] split_num(String sqStr, int numDigits) {
        int len = sqStr.length();
        String right = sqStr.substring(len - numDigits);
        String left = sqStr.substring(0, len - numDigits);
        if (left.isEmpty()) left="0"; // Handle cases like 1,9
       return new String[]{left, right};

    }
}
