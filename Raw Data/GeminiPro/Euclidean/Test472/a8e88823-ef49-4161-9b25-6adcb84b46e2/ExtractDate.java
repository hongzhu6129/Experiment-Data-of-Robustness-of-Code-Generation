import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ExtractDate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date string (e.g., yyyy-MM-dd): ");
        String dateString = scanner.nextLine();

        try {
            // Define the expected date format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // Parse the date string
            LocalDate date = LocalDate.parse(dateString, formatter);

            // Extract year, month, and day
            int year = date.getYear();
            int month = date.getMonthValue();
            int day = date.getDayOfMonth();

            System.out.println("Year: " + year);
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);


        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }
        scanner.close(); // Close the scanner

    }
}
