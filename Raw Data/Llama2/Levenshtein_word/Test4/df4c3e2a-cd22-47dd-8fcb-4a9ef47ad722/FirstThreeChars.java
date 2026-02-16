import java.util.Scanner;

public class FirstThreeChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = scanner.nextLine();

        String result = "";

        if (str1.length() >= 3) {
            result = str1.substring(0, 3);
        } else {
            result = str1;
            while (result.length() < 3) {
                result += "#";
            }
        }

        System.out.println("Result: " + result);
        scanner.close(); 
    }
}
