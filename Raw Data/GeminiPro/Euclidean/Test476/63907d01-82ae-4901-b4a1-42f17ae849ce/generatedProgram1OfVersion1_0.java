import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class StringToDateAndTime {

    public static void main(String[] args) {

        // String to Date and Time
        String dateTimeString = "2024-03-15T10:30:00";  // Example ISO-8601 format
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);

        System.out.println("Converted LocalDateTime: " + dateTime);


        String dateString = "2024-03-15"; // Example date string
        LocalDate date = LocalDate.parse(dateString);
        System.out.println("Converted LocalDate: " + date);



        String timeString = "10:30:00"; // Example time string
        LocalTime time = LocalTime.parse(timeString);
        System.out.println("Converted LocalTime: " + time);


         // Handling time zones (Important!)
        String zonedDateTimeString = "2024-03-15T10:30:00+02:00"; // With timezone
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(zonedDateTimeString);
        System.out.println("Converted ZonedDateTime: " + zonedDateTime);


        // Date and Time to String
        LocalDateTime currentDateTime = LocalDateTime.now();
        String formattedDateTime = currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("Formatted LocalDateTime: " + formattedDateTime);

        LocalDate currentDate = LocalDate.now();
        String formattedDate = currentDate.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Formatted LocalDate: " + formattedDate);



        LocalTime currentTime = LocalTime.now();
        String formattedTime = currentTime.format(DateTimeFormatter.ISO_TIME);
        System.out.println("Formatted LocalTime: " + formattedTime);


        // Handling Time Zones for String Conversion
        ZonedDateTime currentZonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/London")); // Specify zone
        String formattedZonedDateTime = currentZonedDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
        System.out.println("Formatted ZonedDateTime: " + formattedZonedDateTime);

    }
}
