public class KaprekarNumbers {

    public static void main(String[] args) {
        System.out.println("Kaprekar numbers less than 1000:");
        for (int i = 1; i < 1000; i++) {
            if (isKaprekar(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n"); // Add a newline for better formatting
    }

    private static boolean isKaprekar(int num) {
        long square = (long) num * num;
        String sqrStr = String.valueOf(square);
        int numDigits = sqrStr.length();

        for (int i = 1; i < numDigits; i++) {
            String[] parts = split_num(sqrStr, i);
            if (parts[1].length() > 0 &&  // Handle leading zeros correctly
                    Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]) == num) {

                // Additional Check: At least one part should be non-zero (excluding single digit squares)
                if (numDigits > 1 && (Integer.parseInt(parts[0]) > 0 && Integer.parseInt(parts[1]) > 0)) {
                   return true; 
                } else if (numDigits == 1) { // Handle single-digit squares (1,9)
                   return true;
                }

            }
        }
        return false;
    }


    private static String[] split_num(String numStr, int splitIndex) {
        String[] parts = new String[2];
        parts[0] = numStr.substring(0, splitIndex);
        parts[1] = numStr.substring(splitIndex);


        // Handle and remove leading zeros from the second part.
        while (parts[1].length() > 1 && parts[1].startsWith("0")) {
            parts[1] = parts[1].substring(1);

        }

        return parts;
    }
}
