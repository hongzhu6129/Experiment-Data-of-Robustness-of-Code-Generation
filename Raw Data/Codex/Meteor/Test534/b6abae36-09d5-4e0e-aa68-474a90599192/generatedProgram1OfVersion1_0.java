import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifference {

    public static void main(String[] args) {
        // Example dates (you can change these)
        String date1Str = "2024-03-15";
        String date2Str = "2024-03-25";

        try {
            // Parse the date strings into LocalDate objects
            LocalDate date1 = LocalDate.parse(date1Str);
            LocalDate date2 = LocalDate.parse(date2Str);


            // Calculate the difference in days
            long daysBetween = ChronoUnit.DAYS.between(date1, date2);

            // Print the result
            System.out.println("Difference in days between " + date1Str + " and " + date2Str + ": " + daysBetween);

        } catch (java.time.format.DateTimeParseException e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD.");
        }


    }
}
