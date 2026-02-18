import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ExtractDateTime {

    public static void main(String[] args) {
        // Example date strings (adapt to your needs)
        String[] dateStrings = {
                "2024-03-15T10:30:00",
                "2023/12/24 14:45:55",
                "15-Mar-2024 08:00:00",
                "Invalid date string" // Demonstrates error handling
        };

        // Array of common date/time patterns (expand as needed)
        DateTimeFormatter[] formatters = {
                DateTimeFormatter.ISO_LOCAL_DATE_TIME,
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"),
                DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss")
        };



        for (String dateString : dateStrings) {
            LocalDateTime dateTime = null;
            for (DateTimeFormatter formatter : formatters) {
                try {
                    dateTime = LocalDateTime.parse(dateString, formatter);
                    // If parsing successful, break out of inner loop
                    break; 
                } catch (DateTimeParseException e) {
                    // Ignore and try the next formatter
                }
            }

            if (dateTime != null) {
                System.out.println("Original Date String: " + dateString);
                System.out.println("Extracted Date: " + dateTime.toLocalDate());
                System.out.println("Extracted Time: " + dateTime.toLocalTime());
                System.out.println("-----------------------");
            } else {
                System.out.println("Could not parse date: " + dateString);
                System.out.println("-----------------------");
            }
        }
    }
}
