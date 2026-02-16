import java.util.Scanner;

public class AddBinary {

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        String binary1 = scanner.nextLine();
        System.out.print("Input second binary number: ");
        String binary2 = scanner.nextLine();

        try {
            String sum = addBinary(binary1, binary2);
            System.out.println("Sum of two binary numbers: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter valid binary numbers.");
        }
        scanner.close();


    }
}
