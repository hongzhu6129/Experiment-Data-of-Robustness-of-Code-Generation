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
        long square = (long) n * n;
        String sqStr = String.valueOf(square);
        int numDigits = sqStr.length();

        for (int i = 1; i < numDigits; i++) {
            String[] parts = split_num(sqStr, i);
            if (parts[1].length() > 0 && Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]) == n ) {
                // Handle leading zeros in the second part
                if(Integer.parseInt(parts[1]) == 0 && n != 1) continue;
               return true;
            }
        }
        return false;
    }

    private static String[] split_num(String numStr, int index) {
        String[] parts = new String[2];
        parts[0] = numStr.substring(0, numStr.length() - index);
        parts[1] = numStr.substring(numStr.length() - index);
        
        //Handle empty string for the first part.
        if (parts[0].isEmpty()) {
           parts[0] = "0";
        }

        return parts;
    }
}
