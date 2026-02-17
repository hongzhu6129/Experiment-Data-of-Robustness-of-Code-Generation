import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormats {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.systemDefault());

        // yyyy-MM-dd
        System.out.println(now.format(DateTimeFormatter.ISO_DATE));

        // HH:mm:ss
        System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        // yyyy-MM-dd HH:mm:ss
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        // E MMM yyyy HH:mm:ss.SSSZ 
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("E MMM yyyy HH:mm:ss.SSSZ")));

        // HH:mm:ss, Z
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss, Z")));



        // Alternatively, using Locale if desired (Example using US Locale):
        // import java.util.Locale; // Import Locale

        // E MMM yyyy HH:mm:ss.SSSZ (US Locale)
        //DateTimeFormatter formatterUS = DateTimeFormatter.ofPattern("E MMM yyyy HH:mm:ss.SSSZ", Locale.US);
        //System.out.println(zonedDateTime.format(formatterUS));

    }
}
