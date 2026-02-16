import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class SecondsSince1970 {

    public static void main(String[] args) {

        LocalDateTime startOf1970 = LocalDateTime.of(1970, 1, 1, 0, 0, 0);
        LocalDateTime endOf1970 = LocalDateTime.of(1970, 12, 31, 23, 59, 59); 

        long secondsIn1970 = endOf1970.toEpochSecond(ZoneOffset.UTC) - startOf1970.toEpochSecond(ZoneOffset.UTC) + 1;

        System.out.println("Seconds in the year 1970: " + secondsIn1970); // Output: 31536000 
    }
}
