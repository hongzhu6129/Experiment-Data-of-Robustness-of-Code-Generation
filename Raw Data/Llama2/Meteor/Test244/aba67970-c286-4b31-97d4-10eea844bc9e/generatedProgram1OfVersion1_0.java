import java.util.Scanner;

public class DoubleCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String doubledStr = "";
        for (char c : str.toCharArray()) {
            doubledStr += c + "" + c;
        }

        System.out.println("Doubled string: " + doubledStr);
    }
}
