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
            if (parts[1].length() > 0 && !parts[1].startsWith("0")) {  //Avoid leading zeros in the second part
                int right = Integer.parseInt(parts[1]);
                int left = Integer.parseInt(parts[0].isEmpty() ? "0" : parts[0]); //Handle single-digit squares

                if (right + left == n && (right > 0 && left >= 0 )) { //Both parts must be positive
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
