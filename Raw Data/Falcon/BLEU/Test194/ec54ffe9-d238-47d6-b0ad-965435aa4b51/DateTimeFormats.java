import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormats {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.systemDefault());

        // yyyy-MM-dd
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        // HH:mm:ss
        System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        // yyyy-MM-dd HH:mm:ss
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        // E MMM yyyy HH:mm:ss
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("E MMM yyyy HH:mm:ss")));


        // yyyy-MM-dd HH:mm:ss.SSSZ  (Note: SSSZ for milliseconds and zone)
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSZ")));

        // HH:mm:ss, Z (or z for shorter zone)
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss, z"))); // Short zone
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss, Z"))); // Full zone

        //  e mmm yyyy HH:mm:ss.SSSZ (This combines elements from different patterns you requested)
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("e mmm yyyy HH:mm:ss.SSSZ")));

       
    }
}
