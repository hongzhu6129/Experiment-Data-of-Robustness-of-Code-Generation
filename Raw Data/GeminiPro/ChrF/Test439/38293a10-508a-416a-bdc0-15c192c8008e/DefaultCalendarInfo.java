import java.util.Calendar;

public class DefaultCalendarInfo {

    public static void main(String[] args) {
        // Get a default calendar instance
        Calendar calendar = Calendar.getInstance();

        // Get year, month, day, hour, and minute
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Month is 0-indexed, so add 1
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24-hour format
        int minute = calendar.get(Calendar.MINUTE);

        // Display the information
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute); 
    }
}
