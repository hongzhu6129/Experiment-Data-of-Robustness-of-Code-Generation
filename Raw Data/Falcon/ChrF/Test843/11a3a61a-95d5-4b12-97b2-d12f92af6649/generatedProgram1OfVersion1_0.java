import java.util.Scanner;

public class BinaryToHexadecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binaryString = input.nextLine();

        try {
            int decimal = Integer.parseInt(binaryString, 2);
            String hexadecimal = Integer.toHexString(decimal);

            System.out.println("Hexadecimal value: " + hexadecimal);

        } catch (NumberFormatException e) {
            System.out.println("Invalid binary input.");
        } finally{
            input.close();
        }
    }
}
