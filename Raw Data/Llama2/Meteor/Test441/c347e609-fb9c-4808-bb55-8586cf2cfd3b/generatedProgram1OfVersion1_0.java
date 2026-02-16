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


        // e mmm yyyy hh:mm:ss z  (Note: slight variation due to limitations)
        //  "leibstandarte" isn't a standard format specifier and can't be directly included.
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("E MMM yyyy HH:mm:ss z")));



        // yyyy-mm-dd hh:mm:ss.SSSz (milliseconds and zone)
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSz")));



        // hh:mm:ss, Z (hours, minutes, seconds, zone offset) 
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss, Z")));

    }
}
