public class DisariumAndUnhappyNumberChecker {

    public static void main(String[] args) {
        int num = 135; // Example input, you can change this

        if (isDisarium(num)) {
            System.out.println(num + " is a Disarium number.");
        } else {
            System.out.println(num + " is not a Disarium number.");
        }

        if (isUnhappy(num)) {
            System.out.println(num + " is an Unhappy number.");
        } else {
            System.out.println(num + " is a Happy number (not Unhappy).");
        }
    }

    public static boolean isDisarium(int num) {
        String numStr = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, i + 1);
        }
        return sum == num;
    }

    public static boolean isUnhappy(int num) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();
        while (num != 1 && !seen.contains(num)) {
            seen.add(num);
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }
            num = sum;
        }
        return num != 1;
    }
}
