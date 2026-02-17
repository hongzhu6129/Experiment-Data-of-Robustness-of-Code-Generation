import java.util.Scanner;

public class CharacterBenchmark {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string from the user
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        // Get the character to search for
        System.out.println("Enter a character to search for: ");
        char ch = scanner.next().charAt(0);

        // Perform the benchmark
        long startTime = System.currentTimeMillis();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        long endTime = System.currentTimeMillis();

        // Print the results
        System.out.println("The character '" + ch + "' appears " + count + " times in the string.");
        System.out.println("The benchmark took " + (endTime - startTime) + " milliseconds.");
    }
}
