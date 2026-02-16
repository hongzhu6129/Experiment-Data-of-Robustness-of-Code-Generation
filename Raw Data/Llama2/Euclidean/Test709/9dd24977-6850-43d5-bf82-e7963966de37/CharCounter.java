import java.util.Scanner;

public class CharCounter {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        System.out.print("Enter the character to count: ");
        char targetChar = scanner.nextLine().charAt(0);

        int count = 0;
        for (char c : (str1 + str2).toCharArray()) {
            if (c == targetChar) {
                count++;
            }
        }

        System.out.println("The character '" + targetChar + "' appears " + count + " times in the combined strings.");

        long endTime = System.nanoTime();
        displayExecutionTime(endTime - startTime);
        scanner.close();

    }


    private static void displayExecutionTime(long time) {
        System.out.println("Execution Time: " + time + " nanoseconds");
    }
}
