import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class StringToDateConverter {

    public static void main(String[] args) {
        // Example usage:
        String dateString1 = "2024-03-15";
        String dateString2 = "2023/12/28";
        String dateString3 = "Mar 10, 2024";
        String dateString4 = "20240315"; // YYYYMMDD
        String dateTimeString = "2024-03-15T10:30:00"; // ISO 8601 Date Time format

        convertToDate(dateString1);
        convertToDate(dateString2);
        convertToDate(dateString3);
        convertToDate(dateString4);
        convertToDateTime(dateTimeString);

        // Handle potential errors
        String invalidDateString = "invalid date";
        convertToDate(invalidDateString);


    }

    private static void convertToDate(String dateString) {
        DateTimeFormatter[] formatters = {
                DateTimeFormatter.ofPattern("yyyy-MM-dd"),
                DateTimeFormatter.ofPattern("yyyy/MM/dd"),
                DateTimeFormatter.ofPattern("MMM dd, yyyy"),
                DateTimeFormatter.ofPattern("yyyyMMdd")
        };


        LocalDate date = null;
        for (DateTimeFormatter formatter : formatters) {
            try {
                date = LocalDate.parse(dateString, formatter);
                System.out.println("Successfully parsed date: " + date);
                break; // Stop trying other formats once successful 
            } catch (DateTimeParseException e) {
                // Ignore the exception and try the next formatter.
            }
        }


        if (date == null) {  // Print error message if none of the formats worked.
            System.out.println("Could not parse date: " + dateString);
        }
    }



        private static void convertToDateTime(String dateTimeString) {
            try {
                LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                System.out.println("Successfully parsed date and time: " + dateTime);

            } catch (DateTimeParseException e) {
                 System.out.println("Could not parse date and time: " + dateTimeString);
            }
        }
}


