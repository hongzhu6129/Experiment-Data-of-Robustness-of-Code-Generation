import java.util.Scanner;

public class DuckNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number : ");
        String numStr = scanner.nextLine();

        if (numStr.charAt(0) == '0') {
            System.out.println("Not a Duck number");
        } else {
            boolean isDuck = false;
            for (int i = 1; i < numStr.length(); i++) {
                if (numStr.charAt(i) == '0') {
                    isDuck = true;
                    break;
                }
            }
            if (isDuck) {
                System.out.println("Duck number");
            } else {
                System.out.println("Not a Duck number");
            }
        }
        scanner.close();
    }
}
