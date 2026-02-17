import java.time.ZoneId;
import java.util.Set;

public class TimeZones {

    public static void main(String[] args) {
        Set<String> allZoneIds = ZoneId.availableZoneIds();

        System.out.println("Available Time Zones (including UTC and GMT):");
        for (String zoneId : allZoneIds) {
            if (zoneId.contains("UTC") || zoneId.contains("GMT")) {  // Filter for UTC and GMT
                System.out.println(zoneId);
            }
        }


        // Demonstrating how to specifically get UTC and GMT (if filtering is not preferred)
        System.out.println("\nSpecifically getting UTC and GMT:");
        System.out.println("UTC: " + ZoneId.get("UTC")); // or ZoneId.UTC
        System.out.println("GMT: " + ZoneId.get("GMT")); // or ZoneId.GMT


        // Showing how "GMT" zones are actually "Etc/GMT" with offsets.
        System.out.println("\nEtc/GMT zones:");
        for(String zoneId : allZoneIds) {
            if(zoneId.startsWith("Etc/GMT")) {
                System.out.println(zoneId);
            }

        }

    }
}
