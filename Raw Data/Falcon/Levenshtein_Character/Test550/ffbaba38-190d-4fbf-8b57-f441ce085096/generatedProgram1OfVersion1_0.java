import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormats {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();


        // yyyy-mm-dd
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        // hh:mm:ss
        System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        // yyyy-mm-dd hh:mm:ss
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        // e mmm yyyy hh:mm:ss.sssz  (e is day-of-week, mmm is abbreviated month)
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("e MMM yyyy HH:mm:ss.SSSZ")));


        // hh:mm:ss, z (z is time zone abbreviation)
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss, z")));


        // hh:mm:ss, Z (Z is time zone offset)
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss, Z"))); // Using Z for zone offset


    }
}
