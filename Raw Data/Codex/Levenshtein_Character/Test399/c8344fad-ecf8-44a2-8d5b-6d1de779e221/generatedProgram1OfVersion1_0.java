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

    private static boolean isKaprekar(int num) {
        long square = (long) num * num;
        String sqStr = String.valueOf(square);
        int numDigits = sqStr.length();

        for (int i = 1; i < numDigits; i++) {
            String[] parts = split_num(sqStr, i);
            if (parts[1].length() > 0 && Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]) == num ) {
                // Handle leading zeros in the second part for cases like 99 (9801 splits into 98 and 01)
                if(Integer.parseInt(parts[1]) == 0 && num != 0) continue; // Special case to prevent 0 + any number being kaprekar
                 return true;
            }
        }
        return false;
    }

    private static String[] split_num(String numStr, int splitIndex) {
        String[] parts = new String[2];
        parts[0] = numStr.substring(0, splitIndex);
        parts[1] = numStr.substring(splitIndex);
        
        // Handle the potential empty string which parseInt doesn't like
        if (parts[0].isEmpty()) parts[0] = "0";

        return parts;
    }
}
