import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class UnixTimestampToDate {

    public static void main(String[] args) {
        // Example Unix timestamp (representing seconds since the epoch)
        long unixTimestamp = 1678886400; // Example: March 15, 2023 00:00:00 GMT

        // Method 1: Using java.time (Java 8 and later - preferred)
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(unixTimestamp), ZoneId.systemDefault());
        System.out.println("Date (java.time): " + dateTime);

        // Method 2: Using java.util.Date (older approach)
        Date date = new Date(unixTimestamp * 1000); // Multiply by 1000 to convert seconds to milliseconds
        System.out.println("Date (java.util.Date): " + date);


        // Example with a different timestamp and specific timezone:
        long anotherUnixTimestamp = 1700000000;  // Example
        ZoneId specificZone = ZoneId.of("America/New_York"); // Example timezone
        LocalDateTime dateTimeSpecificZone =  LocalDateTime.ofInstant(Instant.ofEpochSecond(anotherUnixTimestamp), specificZone);
        System.out.println("Date (specific timezone): " + dateTimeSpecificZone);


    }
}
