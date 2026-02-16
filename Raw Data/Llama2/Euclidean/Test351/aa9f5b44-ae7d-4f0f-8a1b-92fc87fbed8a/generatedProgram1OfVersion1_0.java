import java.sql.Timestamp;
import java.time.Instant;

public class CurrentTimestamp {

    public static void main(String[] args) {

        // Method 1: Using java.sql.Timestamp
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Current Timestamp (java.sql.Timestamp): " + timestamp);


        // Method 2: Using java.time.Instant (Java 8 and later - preferred)
        Instant instant = Instant.now();
        System.out.println("Current Timestamp (java.time.Instant): " + instant);


        //If you need a formatted string representation:
        //  See https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        // java.time.format.DateTimeFormatter  is much better than older formatting options like SimpleDateFormat.

    }
}
