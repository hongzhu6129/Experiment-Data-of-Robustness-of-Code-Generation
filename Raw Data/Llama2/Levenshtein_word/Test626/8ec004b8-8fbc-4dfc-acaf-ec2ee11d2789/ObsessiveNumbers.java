public class ObsessiveNumbers {

    public static void main(String[] args) {
        System.out.println("Obsessive (Narcissistic) numbers between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isObsessive(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isObsessive(int number) {
        String numStr = String.valueOf(number);
        int numDigits = numStr.length();
        int sum = 0;

        for (int i = 0; i < numDigits; i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, numDigits);
        }

        return sum == number;
    }
}
