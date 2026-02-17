import java.util.Scanner;

public class MultiplyBinary {

    public static String multiplyBinary(String bin1, String bin2, String bin3) {
        try {
            int dec1 = Integer.parseInt(bin1, 2);
            int dec2 = Integer.parseInt(bin2, 2);
            int dec3 = Integer.parseInt(bin3, 2);

            int product = dec1 * dec2 * dec3;

            return Integer.toBinaryString(product);
        } catch (NumberFormatException e) {
            return "Invalid Input: Not a binary number";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first binary number: ");
        String bin1 = scanner.nextLine();

        System.out.print("Enter the second binary number: ");
        String bin2 = scanner.nextLine();

        System.out.print("Enter the third binary number: ");
        String bin3 = scanner.nextLine();


        String result = multiplyBinary(bin1, bin2, bin3);
        System.out.println("Product: " + result);

        scanner.close();
    }
}
