import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.util.Set;

public class TimeZones {

    public static void main(String[] args) {
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        DateTimeFormatter formatterUTC = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        DateTimeFormatter formatter0500 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z");


        System.out.println("Available Time Zones in UTC and +0500:");

        for (String zoneId : allZoneIds) {
            ZoneId zone = ZoneId.of(zoneId);

            // Get current time in UTC for the zone
            ZonedDateTime utcDateTime = ZonedDateTime.now(zone).withZoneSameInstant(ZoneId.of("UTC"));

            // Get current time in +0500 for the zone
            ZonedDateTime plus0500DateTime = ZonedDateTime.now(zone).withZoneSameInstant(ZoneId.of("+05:00")); // Or ZoneOffset.of("+05:00")



            System.out.println(zoneId + ":\tUTC: " + formatterUTC.format(utcDateTime) 
                               + "\t+0500: " + formatter0500.format(plus0500DateTime)  );
        }
    }
}
