import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class TimeZones {

    public static void main(String[] args) {
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        DateTimeFormatter formatterUTC = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        DateTimeFormatter formatterPlus5 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");


        System.out.println("Available Time Zones (UTC and +05:00):");

        for (String zoneId : allZoneIds) {
            ZoneId zone = ZoneId.of(zoneId);
            ZonedDateTime utcDateTime = ZonedDateTime.now(zone).withZoneSameInstant(ZoneId.of("UTC"));
            ZonedDateTime plus5DateTime = ZonedDateTime.now(zone).withZoneSameInstant(ZoneId.of("UTC+05:00")); // Or Asia/Karachi


            System.out.println(zoneId + ":");
            System.out.println("  UTC: " + formatterUTC.format(utcDateTime));
            System.out.println("  +05:00: " + formatterPlus5.format(plus5DateTime));
        }
    }
}
