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

    private static boolean isKaprekar(int num) {
        long square = (long) num * num;
        String sqrStr = String.valueOf(square);
        int numDigits = sqrStr.length();

        for (int i = 1; i < numDigits; i++) {
            String[] parts = split_num(sqrStr, i);
            if (parts[1].length() > 0 && !parts[1].startsWith("0")) { //Handle leading zeros
                int right = Integer.parseInt(parts[1]);
                int left = (parts[0].isEmpty()) ? 0 : Integer.parseInt(parts[0]); //Handle single-digit squares

                if (left + right == num) {
                    return true;
                }

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
