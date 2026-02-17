import java.util.Date;

public class UnixTimestampToDate {

    public static void main(String[] args) {
        // Example Unix timestamp (in seconds) - represents milliseconds since epoch
        long unixTimestamp = 1678886400; 

        // Convert to milliseconds
        long unixTimestampMillis = unixTimestamp * 1000L;

        // Create a Date object from the milliseconds
        Date date = new Date(unixTimestampMillis);

        // Print the formatted date
        System.out.println("Date: " + date);


        // Handling command-line arguments (optional):
        if (args.length > 0) {
            try {
                unixTimestamp = Long.parseLong(args[0]);
                unixTimestampMillis = unixTimestamp * 1000L;  // Convert to millis
                date = new Date(unixTimestampMillis);
                System.out.println("Date from argument: " + date);
            } catch (NumberFormatException e) {
                System.err.println("Invalid timestamp argument: " + args[0]);
            }
        }
    }
}
