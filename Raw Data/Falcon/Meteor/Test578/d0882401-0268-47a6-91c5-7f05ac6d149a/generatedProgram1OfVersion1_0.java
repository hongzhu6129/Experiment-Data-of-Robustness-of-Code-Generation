import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class StringToDateConverter {

    public static void main(String[] args) {
        // Example usage:
        String dateString1 = "2024-03-15";
        String dateString2 = "15/03/2024";
        String dateString3 = "Mar 15, 2024";
        String dateString4 = "2024-03-15T10:30:00"; // Date and Time
        String dateString5 = "10:30:00";             // Time only


        convertToDate(dateString1, "yyyy-MM-dd");
        convertToDate(dateString2, "dd/MM/yyyy");
        convertToDate(dateString3, "MMM dd, yyyy");
        convertToDate(dateString4, "yyyy-MM-dd'T'HH:mm:ss");
        convertToDate(dateString5, "HH:mm:ss");

        // Demonstrating Locale:
        convertToDate("15 mars 2024", "dd MMMM yyyy", Locale.FRANCE); // French locale

        //Handling invalid input:
        convertToDate("invalid date", "yyyy-MM-dd");// This will print an error message
        convertToDate(null, "yyyy-MM-dd");// This will print an error message
    }

    public static void convertToDate(String dateString, String format) {
        convertToDate(dateString, format, Locale.getDefault()); // Use default locale if none is specified.
    }


    public static void convertToDate(String dateString, String format, Locale locale) {
        if (dateString == null || dateString.isEmpty()) {
            System.out.println("Invalid date string: Cannot be null or empty.");
            return;
        }


        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format, locale);

            if (format.contains("H") || format.contains("m") || format.contains("s")) { // Check if the format string contains time components.
                LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);
                System.out.println("Converted LocalDateTime: " + dateTime);

                // Or, if you only want the date part:
                LocalDate date = dateTime.toLocalDate(); 
                System.out.println("Date part: " + date);

                // Or if you only want the time part:
                LocalTime time = dateTime.toLocalTime();
                System.out.println("Time part: " + time);

            } else {
                LocalDate date = LocalDate.parse(dateString, formatter);
                System.out.println("Converted LocalDate: " + date);
            }

        } catch (DateTimeParseException e) {
            System.err.println("Error parsing date: " + e.getMessage());
        }
    }
}
