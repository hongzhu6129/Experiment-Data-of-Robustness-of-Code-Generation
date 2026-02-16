import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringToDateConverter {

    public static void main(String[] args) {
        // Example usage:
        String dateString1 = "2024-03-15";
        String dateString2 = "2024/03/15";
        String dateString3 = "15-Mar-2024";
        String dateString4 = "March 15, 2024";
        String dateString5 = "2024-03-15 10:30:45"; // Date and Time


        convertStringToDate(dateString1, "yyyy-MM-dd");
        convertStringToDate(dateString2, "yyyy/MM/dd");
        convertStringToDate(dateString3, "dd-MMM-yyyy");
        convertStringToDate(dateString4, "MMMM dd, yyyy");
        convertStringToDate(dateString5, "yyyy-MM-dd HH:mm:ss"); // Date and time

       // Demonstrating how to handle invalid input.
        convertStringToDate("invalid date", "yyyy-MM-dd");


    }

    public static void convertStringToDate(String dateString, String format) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

            // Check if the string includes time information
            if (format.contains("H") || format.contains("m") || format.contains("s")) {
                LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);
                System.out.println("Converted LocalDateTime: " + dateTime);
            } else {
                LocalDate date = LocalDate.parse(dateString, formatter);
                System.out.println("Converted LocalDate: " + date);

            }
        } catch (DateTimeParseException e) {
            System.err.println("Invalid date string or format: " + e.getMessage());
        }

    }
}



