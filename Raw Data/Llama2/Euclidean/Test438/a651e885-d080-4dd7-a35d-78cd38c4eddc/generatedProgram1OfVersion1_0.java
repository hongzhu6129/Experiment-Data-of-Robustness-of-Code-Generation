import java.util.Calendar;
import java.util.GregorianCalendar;

public class DefaultCalendarInfo {

    public static void main(String[] args) {
        // Get a default calendar instance (GregorianCalendar)
        Calendar calendar = new GregorianCalendar();

        // Get year, month, day, day of week, minute
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH); // Month is 0-indexed (0=January, 1=February, ...)
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); // 1=Sunday, 2=Monday, ..., 7=Saturday
        int minute = calendar.get(Calendar.MINUTE);


        // Display the information
        System.out.println("Current Date and Time Information:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + (month + 1)); // Add 1 to display month in the usual 1-12 format
        System.out.println("Day of Month: " + dayOfMonth);
        System.out.println("Day of Week: " + dayOfWeek); // You can format this to the day name if needed
        System.out.println("Minute: " + minute);



        // Displaying day of week as a String (optional):
        String dayOfWeekString;
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                dayOfWeekString = "Sunday";
                break;
            case Calendar.MONDAY:
                dayOfWeekString = "Monday";
                break;
            case Calendar.TUESDAY:
                dayOfWeekString = "Tuesday";
                break;
            case Calendar.WEDNESDAY:
                dayOfWeekString = "Wednesday";
                break;
            case Calendar.THURSDAY:
                dayOfWeekString = "Thursday";
                break;
            case Calendar.FRIDAY:
                dayOfWeekString = "Friday";
                break;
            case Calendar.SATURDAY:
                dayOfWeekString = "Saturday";
                break;
            default:
                dayOfWeekString = "Unknown"; // Should not happen
        }
        System.out.println("Day of Week (String): " + dayOfWeekString);
    }
}
