import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormats {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.systemDefault());


        // yyyy-mm-dd
        System.out.println(now.format(DateTimeFormatter.ISO_DATE));

        // hh:mm:ss
        System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));


        // yyyy-mm-dd hh:mm:ss
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        // E MMM yyyy HH:mm:ss.SSSZ 
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("E MMM yyyy HH:mm:ss.SSSZ")));

        // hh:mm:ss, z
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss, z")));


    }
}
