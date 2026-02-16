import java.util.Scanner;

public class DoubleString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        String doubledString = "";
        for (int i = 0; i < str.length(); i++) {
            doubledString += str.charAt(i) + "" + str.charAt(i);
        }

        System.out.println("Doubled string: " + doubledString);
    }
}
