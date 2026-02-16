import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringToDateConverter {

    public static void main(String[] args) {
        // Example usage:
        String dateString1 = "2023-10-27";
        String dateString2 = "2023-12-15T14:30:00"; // ISO 8601 format with time
        String dateString3 = "October 27, 2023";
        String dateString4 = "27/10/2023";  // dd/MM/yyyy
        String dateString5 = "10/27/2023";  // MM/dd/yyyy (ambiguous!)
        String timeString1 = "14:30";


        convertToDate(dateString1, "yyyy-MM-dd");
        convertToDate(dateString2, "yyyy-MM-dd'T'HH:mm:ss"); // Note the 'T' literal
        convertToDate(dateString3, "MMMM dd, yyyy");
        convertToDate(dateString4, "dd/MM/yyyy");
        convertToDate(dateString5, "MM/dd/yyyy"); // Handle ambiguous dates carefully
        convertToTime(timeString1, "HH:mm");



       
    }

    public static void convertToDate(String dateString, String format) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
            LocalDate date = LocalDate.parse(dateString, formatter);
            System.out.println("Converted date: " + date);
        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format: " + e.getMessage());
        }
    }

    public static void convertToTime(String timeString, String format) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
            LocalTime time = LocalTime.parse(timeString, formatter);
            System.out.println("Converted time: " + time);
        } catch (DateTimeParseException e) {
            System.err.println("Invalid time format: " + e.getMessage());
        }

    }
}

