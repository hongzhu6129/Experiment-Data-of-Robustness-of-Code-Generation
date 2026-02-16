public class KaprekarNumbers {

    public static void main(String[] args) {
        int count = 0;
        System.out.println("Kaprekar numbers less than 1000:");
        for (int i = 1; i < 1000; i++) {
            if (isKaprekar(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n" + count + " kaprekar numbers.");
    }

    private static boolean isKaprekar(int n) {
        int square = n * n;
        String sqrStr = String.valueOf(square);
        int numDigits = sqrStr.length();

        for (int i = 1; i < numDigits; i++) {
            String[] parts = split_num(sqrStr, i);
            if (parts[1].length() > 0 &&  // Handle leading zeros correctly
                 Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]) == n) {
                 return true;
            }
        }
        return false;
    }

    private static String[] split_num(String numStr, int index) {
        String[] parts = new String[2];
        parts[0] = numStr.substring(0, index);
        parts[1] = numStr.substring(index);
        
        // Handle cases where the first part is empty (e.g., splitting "9" at index 1)
        if (parts[0].isEmpty()) {
            parts[0] = "0";
        }

         //Handle cases where the second part is empty (e.g. splitting "1" at index 1)
         if(parts[1].isEmpty()){
             parts[1] = "0";
         }


        return parts;
    }
}
