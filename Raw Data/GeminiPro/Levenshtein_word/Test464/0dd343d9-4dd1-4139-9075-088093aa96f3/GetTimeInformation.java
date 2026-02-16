import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GetTimeInformation {

    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();

        System.out.println("Current Time: " + currentTime);

        DateTimeFormatter formatter12Hour = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedTime12Hour = currentTime.format(formatter12Hour);
        System.out.println("12-Hour Format: " + formattedTime12Hour);

        DateTimeFormatter formatter24Hour = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime24Hour = currentTime.format(formatter24Hour);
        System.out.println("24-Hour Format: " + formattedTime24Hour);


        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();

        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);

        String amPm = (hour < 12) ? "AM" : "PM";  // Determine AM or PM

        int hour12 = (hour > 12) ? hour - 12 : (hour == 0 ? 12 : hour); // Adjust hour for 12-hour format


        System.out.println("12-Hour format (calculated): " + hour12 + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second) + " " + amPm); // Corrected padding


    }
}
