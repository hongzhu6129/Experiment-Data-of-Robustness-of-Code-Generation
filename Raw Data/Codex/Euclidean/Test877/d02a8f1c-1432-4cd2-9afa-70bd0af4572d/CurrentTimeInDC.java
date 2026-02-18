import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentTimeInDC {

    public static void main(String[] args) {
        // Get the current time in New Delhi/Kolkata
        ZoneId kolkataZoneId = ZoneId.of("Asia/Kolkata"); // Or "Asia/Calcutta" - both are same
        ZonedDateTime nowKolkata = ZonedDateTime.now(kolkataZoneId);

        // Format the time for output (optional, but makes it nicer)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedDateTime = nowKolkata.format(formatter);

        System.out.println("Current time in New Delhi/Kolkata: " + formattedDateTime);



        // Get the current time in Washington D.C.
        ZoneId dcZoneId = ZoneId.of("America/New_York"); // Washington D.C. is in the Eastern Time Zone
        ZonedDateTime nowDC = ZonedDateTime.now(dcZoneId);

        // Format the time for output (optional)
        String formattedDateTimeDC = nowDC.format(formatter);


        System.out.println("Current time in Washington D.C.: " + formattedDateTimeDC);
    }
}
