public class KaprekarNumbers {

    public static void main(String[] args) {
        System.out.println("Kaprekar numbers less than 1000:");
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if (isKaprekar(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count + " Kaprekar numbers.");
    }

    private static boolean isKaprekar(int n) {
        long square = (long) n * n;
        String sqStr = String.valueOf(square);
        int numDigits = sqStr.length();

        for (int i = 1; i < numDigits; i++) {
            String[] parts = split_num(sqStr, i);
            if (parts[1].length() > 0 &&  // Handle cases like 1
                    Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]) == n ) {

                
                return true;

            }
        }
        return false;
    }

    private static String[] split_num(String numStr, int index) {
        String[] parts = new String[2];
        parts[0] = numStr.substring(0, numStr.length() - index);
        parts[1] = numStr.substring(numStr.length() - index);

          if(parts[0].isEmpty()){ // Handle the case where the first part is empty (e.g., for 1*1 = 1)
             parts[0] = "0";
        }

        return parts;
    }
}
