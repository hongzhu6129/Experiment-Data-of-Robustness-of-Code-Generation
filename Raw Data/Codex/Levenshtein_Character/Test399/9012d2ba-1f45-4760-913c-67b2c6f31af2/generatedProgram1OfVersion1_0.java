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
        System.out.println("\n" + count + " kaprekar numbers.");
    }

    private static boolean isKaprekar(int n) {
        long square = (long) n * n;
        String sqrStr = String.valueOf(square);
        int numDigits = sqrStr.length();

        for (int i = 1; i < numDigits; i++) {
            String[] parts = split_num(sqrStr, i);
            if (parts[1].length() > 0 &&  // Handle cases like 1
                 Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]) == n) {
                 if (Integer.parseInt(parts[1]) == 0 && n ==1) return true; // special case for 1.
                 if (Integer.parseInt(parts[1]) > 0) return true;
             } 
        }

        return false;
    }

    private static String[] split_num(String numStr, int splitIndex) {
        String[] parts = new String[2];
        parts[0] = numStr.substring(0, splitIndex);
        if (parts[0].isEmpty()) {
            parts[0] = "0";  // Handle leading zeros
        }
        parts[1] = numStr.substring(splitIndex);
        return parts;
    }
}



