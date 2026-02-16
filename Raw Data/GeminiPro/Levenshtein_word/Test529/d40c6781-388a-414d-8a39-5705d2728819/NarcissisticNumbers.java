public class NarcissisticNumbers {

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isNarcissistic(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isNarcissistic(int number) {
        String numStr = String.valueOf(number);
        int power = numStr.length();
        int sum = 0;

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, power);
        }

        return sum == number;
    }
}
