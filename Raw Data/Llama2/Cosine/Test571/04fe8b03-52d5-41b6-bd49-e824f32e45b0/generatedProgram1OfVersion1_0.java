import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringToDateConverter {

    public static void main(String[] args) {
        // Example usage:
        String dateString1 = "2023-10-27";
        String dateString2 = "2023-10-27 10:30:00";
        String dateString3 = "27/10/2023";
        String dateString4 = "Oct 27, 2023";  // Demonstrates more flexible parsing
        String dateString5 = "20231027";       // Demonstrates parsing without delimiters

        convertToDate(dateString1, "yyyy-MM-dd");
        convertToDate(dateString2, "yyyy-MM-dd HH:mm:ss");
        convertToDate(dateString3, "dd/MM/yyyy"); 
        convertToDate(dateString4, "MMM dd, yyyy");
        convertToDate(dateString5, "yyyyMMdd");



        // Handling invalid input
        String invalidDateString = "invalid-date";
        convertToDate(invalidDateString, "yyyy-MM-dd");


    }

    public static void convertToDate(String dateString, String format) {
        try {

             DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

            // Try parsing as a LocalDate first
            try {
                LocalDate date = LocalDate.parse(dateString, formatter);
                System.out.println("Converted LocalDate: " + date);
                return;  // Exit if successful
            } catch (DateTimeParseException e) {
                // If it's not a LocalDate, try parsing as a LocalDateTime
                 try {
                     LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);
                     System.out.println("Converted LocalDateTime: " + dateTime);
                     return;
                 } catch (DateTimeParseException ex) {
                     //If it's not LocalDateTime, try parsing as LocalTime
                     try {
                        LocalTime time = LocalTime.parse(dateString, formatter);
                        System.out.println("Converted LocalTime: "+ time);
                        return;
                     }catch(DateTimeParseException exc){
                         //Ignore it here. The final exception will handle this case.
                     }
                }

            }

            throw new DateTimeParseException("Could not parse date/time: " + dateString, dateString, 0); // Re-throw for the outer catch to handle



        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format: " + dateString + ". Expected format: " + format  + " " + e.getMessage());
        }
    }
}


