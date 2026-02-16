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
                
                 // Handle leading zeros in the second part, as per problem description (e.g., 99 -> 98 + 01)
                if (Long.parseLong(sqStr) == Long.parseLong(parts[0] + String.format("%0" + parts[1].length() +"d",Integer.parseInt(parts[1]))))
                    return true;

            }


        }
        return false;
    }

    private static String[] split_num(String numStr, int index) {
        String[] parts = new String[2];
        parts[0] = numStr.substring(0, index);
        parts[1] = numStr.substring(index);
        return parts;
    }
}
