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

    private static boolean isKaprekar(int num) {
        long square = (long) num * num;
        String sqStr = String.valueOf(square);
        int numDigits = sqStr.length();

        for (int i = 1; i < numDigits; i++) {
            String[] parts = split_num(sqStr, i);
            if (parts[1].equals("0")) continue; // Avoid adding with "0" as it could lead to false positives with leading zeroes in part 2
            
            try{
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);

                if (num1 + num2 == num) {
                    return true;
                }
            } catch (NumberFormatException e) {
                 // Handle cases where parsing might fail due to large numbers or other issues
                return false; 
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
