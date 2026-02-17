import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringToDate {

    public static void main(String[] args) {
        // String to Date
        String dateString = "2023-10-27";
        String dateTimeString = "2023-10-27 10:30:00";

        try {
            LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ISO_DATE);
            System.out.println("Converted Date: " + date);

            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.println("Converted DateTime: " + dateTime);


            // Handling different date/time formats
            String customDateString = "27/Oct/2023";
            DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
            LocalDate customDate = LocalDate.parse(customDateString, customFormatter);
            System.out.println("Converted Custom Date: " + customDate);


        } catch (DateTimeParseException e) {
            System.err.println("Invalid date/time format: " + e.getMessage());
        }



        // Date to String
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalTime currentTime = LocalTime.now();


        String formattedDate = currentDate.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Formatted Date: " + formattedDate);

        String formattedDateTime = currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("Formatted DateTime: " + formattedDateTime);


        String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Formatted Time: " + formattedTime);


        // Example with custom format
        String customFormattedDate = currentDate.format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy")); // Example: Friday, October 27, 2023
        System.out.println("Custom Formatted Date: " + customFormattedDate);


    }
}
