import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ExtractDateTime {

    public static void main(String[] args) {
        // Example date string (you can change this)
        String dateString = "2024-03-15T10:30:00"; 

        // Define the date-time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");


        try {
            // Parse the date string
            LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);

            // Extract date and time components
            int year = dateTime.getYear();
            int month = dateTime.getMonthValue();
            int day = dateTime.getDayOfMonth();
            int hour = dateTime.getHour();
            int minute = dateTime.getMinute();
            int second = dateTime.getSecond();

            // Print the extracted date and time
            System.out.println("Date: " + year + "-" + month + "-" + day);
            System.out.println("Time: " + hour + ":" + minute + ":" + second);


        } catch (DateTimeParseException e) {
            System.err.println("Invalid date string format: " + e.getMessage());
        }


        // Example with another format:
        dateString = "March 15, 2024 10:30 AM";
        formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm a");

        try {
            LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);
            System.out.println("\nDate (from second example): " + dateTime.toLocalDate()); // Print just the date part
            System.out.println("Time (from second example): " + dateTime.toLocalTime()); // Print just the time part

        } catch (DateTimeParseException e) {
            System.err.println("Invalid date string format (second example): " + e.getMessage());
        }

    }
}
