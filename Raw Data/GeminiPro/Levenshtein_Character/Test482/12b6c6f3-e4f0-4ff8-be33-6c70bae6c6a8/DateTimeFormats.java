import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormats {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.systemDefault());


        // yyyy-mm-dd
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        // hh:mm:ss
        System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        // yyyy-mm-dd hh:mm:ss
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        // e mmm yyyy hh:mm:ss.sssz  (Note: 's' for milliseconds needs at least 3, otherwise use 'S')
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("e MMM yyyy HH:mm:ss.SSSZ")));



        // hh:mm:ss, z
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss, z")));


       // hh:mm:ss, Z  (For offset)
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss, Z"))); // For offset


    }
}
