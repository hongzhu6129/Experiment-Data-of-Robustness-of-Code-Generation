import java.time.ZoneId;
import java.util.Set;

public class TimeZones {

    public static void main(String[] args) {
        Set<String> allZones = ZoneId.getAvailableZoneIds();

        System.out.println("Available Time Zones (including UTC and GMT):");
        for (String zone : allZones) {
             // Explicitly check and print UTC and GMT variations 
            if (zone.equals("UTC") || zone.equals("GMT") || zone.startsWith("UTC") || zone.startsWith("GMT")) {
                System.out.println(zone);
            }
        }

          // Or, to print all including those that mention UTC or GMT in their names:
//        for (String zone : allZones) {
//            if (zone.contains("UTC") || zone.contains("GMT")) {
//                 System.out.println(zone);
//            }
//        }


    }
}
