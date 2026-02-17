import java.util.Scanner;

public class CompareStringToStringBuffer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string and string buffer to compare
        System.out.println("Enter the string: ");
        String string1 = scanner.nextLine();

        System.out.println("Enter the string buffer: ");
        StringBuffer stringBuffer = new StringBuffer(scanner.nextLine());

        // Compare the string and string buffer
        boolean isEqual = string1.equals(stringBuffer.toString());

        // Print the result
        if (isEqual) {
            System.out.println("The string and string buffer are equal.");
        } else {
            System.out.println("The string and string buffer are not equal.");
        }
    }
}
