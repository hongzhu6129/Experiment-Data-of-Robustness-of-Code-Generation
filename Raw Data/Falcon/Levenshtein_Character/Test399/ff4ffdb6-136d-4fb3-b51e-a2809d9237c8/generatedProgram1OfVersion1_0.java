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
            if (parts[1].length() > 0 &&  //Avoid leading zero issues 
                Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]) == n && Integer.parseInt(parts[1]) !=0
               )
             {

                return true;
            }
        }
        return false;
    }

    private static String[] split_num(String numStr, int index) {
        String left = numStr.substring(0, index);
        String right = numStr.substring(index);
        return new String[]{left.isEmpty() ? "0" : left, right.isEmpty() ? "0" : right}; // Handle empty strings to avoid NumberFormatException
    }
}
