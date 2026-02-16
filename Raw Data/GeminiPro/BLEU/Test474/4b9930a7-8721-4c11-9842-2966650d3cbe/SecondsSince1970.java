import java.time.Instant;

public class SecondsSince1970 {

    public static void main(String[] args) {

        // Get the current time as an Instant object
        Instant now = Instant.now();

        // Get the number of seconds since the epoch (January 1, 1970, 00:00:00 UTC)
        long secondsSinceEpoch = now.getEpochSecond();

        System.out.println("Seconds since 1970: " + secondsSinceEpoch);
    }
}
