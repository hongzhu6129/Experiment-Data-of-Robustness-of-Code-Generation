import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class StringToDateConverter {

    public static void main(String[] args) {
        // Example usage:
        String dateString = "2024-03-15";
        String dateTimeString = "2024-03-15T10:30:00";  // ISO 8601 format
        String customDateString = "15/Mar/2024";

        LocalDate date = convertToDate(dateString, "yyyy-MM-dd");
        LocalDateTime dateTime = convertToDateTime(dateTimeString, "yyyy-MM-dd'T'HH:mm:ss"); // Note the 'T' literal
        LocalDate customDate = convertToDate(customDateString, "dd/MMM/yyyy");


        if (date != null) {
            System.out.println("Converted date: " + date);
        }

        if (dateTime != null) {
            System.out.println("Converted date and time: " + dateTime);
        }

        if(customDate != null) {
            System.out.println("Converted custom date: " + customDate);
        }



        // Handling invalid input: Example
        String invalidDateString = "2024-13-15"; // Invalid month
        LocalDate invalidDate = convertToDate(invalidDateString, "yyyy-MM-dd");

        if (invalidDate == null) {
            System.out.println("Invalid date string: " + invalidDateString);
        }

        // Another example: just time
        String timeString = "14:35:00";
        LocalTime time = convertToTime(timeString,"HH:mm:ss");

        if(time!= null){
            System.out.println("Converted time: " + time);
        }

    }


    public static LocalDate convertToDate(String dateString, String format) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
            return LocalDate.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            // Handle parsing error (e.g., log it, return null, throw an exception)
            //System.err.println("Error parsing date: " + e.getMessage());  // Print error to console
            return null; // Return null to indicate an error.  Alternative is to throw the exception.
        }
    }

    public static LocalDateTime convertToDateTime(String dateTimeString, String format) {
        try {
             DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
            return LocalDateTime.parse(dateTimeString, formatter);
        } catch (DateTimeParseException e) {
            // Handle parsing error
            //System.err.println("Error parsing datetime: " + e.getMessage()); // Print error to console
            return null;
        }
    }

    public static LocalTime convertToTime(String timeString, String format){
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
            return LocalTime.parse(timeString,formatter);
        }catch(DateTimeParseException e){
            // Handle parsing error
            //System.err.println("Error parsing time: " + e.getMessage());
            return null;
        }
    }
}
