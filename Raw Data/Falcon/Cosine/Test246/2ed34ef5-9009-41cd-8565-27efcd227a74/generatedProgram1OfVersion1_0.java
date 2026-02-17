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
            if (parts[1].equals("0")) {
                continue;
            }

            try {
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);

                if (num1 + num2 == n) {
                    return true;
                }
            } catch (NumberFormatException e) {
                // Ignore if parsing fails (e.g., leading zeros)
            }
        }
        return false;
    }

    private static String[] split_num(String numStr, int splitIndex) {
        String[] parts = new String[2];
        parts[0] = numStr.substring(0, splitIndex);
        parts[1] = numStr.substring(splitIndex);
        return parts;
    }
}
