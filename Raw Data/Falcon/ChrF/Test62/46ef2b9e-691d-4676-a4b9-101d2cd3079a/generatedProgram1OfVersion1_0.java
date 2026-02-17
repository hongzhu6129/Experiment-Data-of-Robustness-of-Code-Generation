import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifference {

    public static void main(String[] args) {
        // Example dates (you can change these)
        String date1String = "2024-03-15";
        String date2String = "2024-04-20";

        try {
            // Parse the date strings into LocalDate objects
            LocalDate date1 = LocalDate.parse(date1String);
            LocalDate date2 = LocalDate.parse(date2String);

            // Calculate the difference in days
            long daysDifference = ChronoUnit.DAYS.between(date1, date2);

            // Print the result
            System.out.println("Difference in days between " + date1String + " and " + date2String + ": " + daysDifference);

        } catch (java.time.format.DateTimeParseException e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD.");
        }

    }
}
