public class NarcissisticNumbers {

    public static void main(String[] args) {
        System.out.println("Narcissistic numbers between 1 and 1000:");

        for (int i = 1; i <= 1000; i++) {
            if (isNarcissistic(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isNarcissistic(int num) {
        String numStr = String.valueOf(num);
        int numDigits = numStr.length();
        int sum = 0;

        for (int i = 0; i < numDigits; i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, numDigits);
        }

        return sum == num;
    }
}




