import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LuckyNumber {

    public static boolean isLucky(int n) {
        Set<Integer> digits = new HashSet<>();

        String numStr = String.valueOf(n);
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            if (digits.contains(digit)) {
                return false; // Duplicate digit found
            }
            digits.add(digit);
        }

        return true; // No duplicate digits
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num = scanner.nextInt();

        if (isLucky(num)) {
            System.out.println(num + " is lucky number?");
            System.out.println("Yes"); // Explicitly print "Yes" or "No"
        } else {
            System.out.println(num + " is lucky number?");
            System.out.println("No");
        }
        scanner.close();
    }
}
