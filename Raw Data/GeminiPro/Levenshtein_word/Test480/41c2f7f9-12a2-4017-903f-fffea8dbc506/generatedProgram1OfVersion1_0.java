import java.util.TimeZone;
import java.util.Set;

public class TimeZones {

    public static void main(String[] args) {

        Set<String> availableIDs = TimeZone.getAvailableIDs().stream().filter(id -> id.startsWith("Etc/GMT") || id.startsWith("UTC")).collect(java.util.stream.Collectors.toSet());


        System.out.println("All available UTC and GMT Time Zones:");

        for (String id : availableIDs) {
            System.out.println(id);
        }
    }
}
