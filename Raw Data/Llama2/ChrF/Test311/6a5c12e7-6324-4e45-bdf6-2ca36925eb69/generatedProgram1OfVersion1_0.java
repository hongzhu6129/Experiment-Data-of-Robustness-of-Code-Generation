import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateAndTimeConversion {

    public static void main(String[] args) {

        // --- Date to LocalDateTime ---
        Date date1 = new Date();  // Current date and time

        // Method 1: Using Instant (preferred)
        LocalDateTime localDateTime1 = date1.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();

        // Method 2: Using milliseconds (less preferred)
        LocalDateTime localDateTime2 = new Date(date1.getTime()).toInstant()
                .atZone(ZoneId.systemDefault()).toLocalDateTime();

        System.out.println("Date: " + date1);
        System.out.println("LocalDateTime 1 (Instant): " + localDateTime1);
        System.out.println("LocalDateTime 2 (millis): " + localDateTime2);



        // --- LocalDateTime to Date ---
        LocalDateTime now = LocalDateTime.now();

        // Method 1: Using ZonedDateTime (preferred for timezone handling)
        Date date2 = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());


        System.out.println("\nLocalDateTime: " + now);
        System.out.println("Date (from ZonedDateTime): " + date2);


        // --- Formatting LocalDateTime ---
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("\nFormatted LocalDateTime: " + formattedDateTime);


         // --- Parsing a String to LocalDateTime ---
        String dateTimeString = "2024-03-15 15:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("Parsed LocalDateTime: " + parsedDateTime);


        // --- Calculating Time Difference ---
        LocalDateTime dateTimeA = LocalDateTime.of(2024, 3, 15, 10, 0, 0);
        LocalDateTime dateTimeB = LocalDateTime.of(2024, 3, 15, 12, 30, 0);

        long minutes = ChronoUnit.MINUTES.between(dateTimeA, dateTimeB);
        long hours = ChronoUnit.HOURS.between(dateTimeA, dateTimeB);

        System.out.println("\nDifference between " + dateTimeA + " and " + dateTimeB + ":");
        System.out.println("Minutes: " + minutes);
        System.out.println("Hours: " + hours);




    }
}
