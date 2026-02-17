import java.util.TimeZone;
import java.util.Arrays;

public class TimeZones {

    public static void main(String[] args) {

        String[] availableIDs = TimeZone.getAvailableIDs();
        Arrays.sort(availableIDs); // Sort for easier readability

        System.out.println("Available Time Zones (UTC/GMT):");

        for (String id : availableIDs) {
            TimeZone tz = TimeZone.getTimeZone(id);
           
            //  Filtering for UTC and GMT. Some zones *contain* UTC/GMT
            // but aren't strictly UTC or GMT. This focuses on those core zones.
            if (id.startsWith("Etc/UTC") || id.startsWith("Etc/GMT") || id.equals("UTC") || id.equals("GMT") || id.equals("GMT0")) { 
                System.out.println(id + " : " + tz.getDisplayName()); 
            }
        }
    }
}
