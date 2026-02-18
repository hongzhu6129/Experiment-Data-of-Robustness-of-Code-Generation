import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeConversion {

    public static void main(String[] args) {
        // Example 1: LocalDateTime to ZonedDateTime
        LocalDateTime localDateTime1 = LocalDateTime.of(2024, 3, 15, 10, 30, 0); 
        ZoneId zoneId1 = ZoneId.of("America/New_York"); // Specify the time zone
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(localDateTime1, zoneId1);

        System.out.println("LocalDateTime: " + localDateTime1);
        System.out.println("ZonedDateTime: " + zonedDateTime1);


        // Example 2: ZonedDateTime to LocalDateTime
        ZonedDateTime zonedDateTime2 = ZonedDateTime.parse("2024-03-15T12:00:00+01:00"); // Example ZonedDateTime
        LocalDateTime localDateTime2 = zonedDateTime2.toLocalDateTime();

        System.out.println("\nZonedDateTime: " + zonedDateTime2);
        System.out.println("LocalDateTime: " + localDateTime2);


        // Example 3: String to LocalDateTime
        String dateTimeString1 = "2024-03-15 15:30:00";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime3 = LocalDateTime.parse(dateTimeString1, formatter1);

        System.out.println("\nString: " + dateTimeString1);
        System.out.println("LocalDateTime: " + localDateTime3);



        // Example 4: LocalDateTime to String (formatted)
        LocalDateTime localDateTime4 = LocalDateTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z"); // Example format
        String dateTimeString2 = localDateTime4.format(formatter2);

        System.out.println("\nLocalDateTime: " + localDateTime4);
        System.out.println("Formatted String: " + dateTimeString2);



        // Example 5: String to ZonedDateTime (you need the time zone)
        String dateTimeString3 = "2024-03-15T18:00:00+08:00"; // Note: Time zone is included in the string
        ZonedDateTime zonedDateTime3 = ZonedDateTime.parse(dateTimeString3); 

        System.out.println("\nString with Time Zone: " + dateTimeString3);
        System.out.println("ZonedDateTime: " + zonedDateTime3);


         // Example 6: ZonedDateTime to String (formatted)
        ZonedDateTime zonedDateTime4 = ZonedDateTime.now();
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z"); // Example format (Z for zone offset)
        String dateTimeString4 = zonedDateTime4.format(formatter3);

        System.out.println("\nZonedDateTime: " + zonedDateTime4);
        System.out.println("Formatted String with Zone: " + dateTimeString4);
    }
}
