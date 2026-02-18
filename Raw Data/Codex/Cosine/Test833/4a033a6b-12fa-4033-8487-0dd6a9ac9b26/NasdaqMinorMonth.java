import java.util.*;
import java.text.*;

public class NasdaqMinorMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter the input string:");
        String input = scanner.nextLine();

        // Parse the input string
        String[] parts = input.split("-");
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        // Create a SimpleDateFormat object
        SimpleDateFormat sdf = new SimpleDateFormat("MMM");

        // Format the month and year
        String formattedMonth = sdf.format(new Date(year - 1900, month - 1, 1));

        // Print the formatted month
        System.out.println("The minor month is: " + formattedMonth);
    }
}
