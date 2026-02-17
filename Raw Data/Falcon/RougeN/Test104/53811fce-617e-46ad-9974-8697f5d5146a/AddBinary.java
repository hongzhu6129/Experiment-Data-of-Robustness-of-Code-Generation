import java.util.Scanner;

public class AddBinary {

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;

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

        System.out.print("Enter the first binary number: ");
        String a = scanner.nextLine();

        System.out.print("Enter the second binary number: ");
        String b = scanner.nextLine();

        String sum = addBinary(a, b);
        System.out.println("Sum: " + sum);

        scanner.close();

      
    }
}
