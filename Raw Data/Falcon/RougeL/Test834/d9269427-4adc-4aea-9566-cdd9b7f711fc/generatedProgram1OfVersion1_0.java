import java.time.Instant;

public class CurrentTimestamp {

    public static void main(String[] args) {
        // Get the current timestamp using Instant.now()
        Instant currentTimestamp = Instant.now();

        // Print the timestamp
        System.out.println("Current Timestamp: " + currentTimestamp);


        // You can also format the timestamp if needed.  For example, to get it in ISO-8601 format:
        System.out.println("Current Timestamp (ISO-8601): " + currentTimestamp.toString());

        //  Or, if you need milliseconds since the epoch (useful for some systems):
        long epochMilli = Instant.now().toEpochMilli();
        System.out.println("Milliseconds since Epoch: " + epochMilli);


    }
}
