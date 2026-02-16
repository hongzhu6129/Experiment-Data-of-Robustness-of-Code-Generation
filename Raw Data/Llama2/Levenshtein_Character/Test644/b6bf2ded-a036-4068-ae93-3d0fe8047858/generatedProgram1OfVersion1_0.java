public class KaprekarNumbers {

    public static void main(String[] args) {
        System.out.println("Kaprekar numbers less than 1000:");
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if (isKaprekar(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n" + count + " Kaprekar numbers.");
    }

    private static boolean isKaprekar(int n) {
        long square = (long) n * n;
        String sqStr = String.valueOf(square);
        int numDigits = sqStr.length();

        for (int i = 1; i < numDigits; i++) {
            String[] parts = split_num(sqStr, i);
            if (parts[1].length() > 0 &&  // Avoid cases where right part is empty string
                 Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]) == n ) { 
                 return true;
            }
        }
        return false;
    }


    private static String[] split_num(String numStr, int splitIndex) {
        String left = numStr.substring(0, splitIndex);
        String right = numStr.substring(splitIndex);

         // Handle leading zeros in the right part.  If the whole right part is 0, that's valid.
        if (right.length() > 0 && right.charAt(0) == '0' && !right.equals("0")) { 
           return new String[]{"",""};  // Signal that this split is invalid
        }

        if(left.length() == 0 ){ // If the left side is 0 due to splitting, handle it as a single digit
            return new String[] {"0", right}; 
        }
         

        return new String[]{left, right};
    }
}
