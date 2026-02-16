import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class SecondsSince1970 {

    public static void main(String[] args) {
        // Get the current date and time.
        LocalDateTime now = LocalDateTime.now();

        // Calculate the seconds since the epoch (January 1, 1970, 00:00:00 UTC).
        long secondsSinceEpoch = now.toEpochSecond(ZoneOffset.UTC);

        // Print the result.
        System.out.println("Seconds since January 1, 1970, 00:00:00 UTC: " + secondsSinceEpoch);



        //If you specifically want the seconds *within* the year 1970 only:
        LocalDateTime start1970 = LocalDateTime.of(1970, 1, 1, 0, 0, 0);
        LocalDateTime end1970 = LocalDateTime.of(1971, 1, 1, 0, 0, 0);

        long secondsIn1970 = end1970.toEpochSecond(ZoneOffset.UTC) - start1970.toEpochSecond(ZoneOffset.UTC);

        System.out.println("Seconds in the year 1970: " + secondsIn1970);


    }
}
