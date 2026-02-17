public class KaprekarNumbers {

    public static void main(String[] args) {
        System.out.println("Kaprekar numbers less than 1000:");
        for (int i = 1; i < 1000; i++) {
            if (isKaprekar(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isKaprekar(int num) {
        int square = num * num;
        String sqStr = String.valueOf(square);
        int numDigits = sqStr.length();

        for (int i = 1; i < numDigits; i++) {
            String[] parts = split_num(sqStr, i);
            if (parts[0].equals("") || parts[1].equals("")) {
                continue; // Skip if either part is empty after splitting
            }

            int right = Integer.parseInt(parts[1]);
            int left;
            if (parts[0].equals(""))
                left = 0;
            else
                left = Integer.parseInt(parts[0]);

            if (right != 0 && (left + right) == num) { // Check for non-zero right part
                return true;
            }
        }
        return false;
    }


    private static String[] split_num(String numStr, int index) {
        String left = numStr.substring(0, index);
        String right = numStr.substring(index);
        return new String[]{left, right};
    }
}
