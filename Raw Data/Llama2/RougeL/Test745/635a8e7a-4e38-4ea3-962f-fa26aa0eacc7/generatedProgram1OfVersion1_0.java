import java.util.Scanner;

public class AnnotateString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the string from the user
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Partially annotate the string by replacing all occurrences of the word "would" with "**would**"
        String annotatedStr = str.replaceAll("would", "**would**");

        // Print the annotated string
        System.out.println("Partially annotated string: " + annotatedStr);
    }
}
