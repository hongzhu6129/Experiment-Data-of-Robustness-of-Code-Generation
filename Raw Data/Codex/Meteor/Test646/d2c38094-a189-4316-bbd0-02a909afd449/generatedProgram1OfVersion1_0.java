import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateExceeds {

    public static void main(String[] args) {
        // Get the current date and time
        Calendar calendar = new GregorianCalendar();

        // Get the current year, month, week of year, and day of month
        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH); // Month is 0-indexed (0-11)
        int currentWeekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int currentDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);


        // Set arbitrary exceed values (you can change these)
        int exceedYear = 2025;
        int exceedMonth = 10; // November (0-indexed)
        int exceedWeekOfYear = 40;
        int exceedDayOfMonth = 15;


        // Calculate the difference (exceeds)
        int yearExceeds = exceedYear - currentYear;
        int monthExceeds = exceedMonth - currentMonth;
        int weekExceeds = exceedWeekOfYear - currentWeekOfYear;
        int dayExceeds = exceedDayOfMonth - currentDayOfMonth;

        // Output the results
        System.out.println("Current Date: " + calendar.getTime()); // Display the current date for context

        System.out.println("Year Exceeds: " + yearExceeds);
        System.out.println("Month Exceeds: " + monthExceeds);
        System.out.println("Week of Year Exceeds: " + weekExceeds);
        System.out.println("Day of Month Exceeds: " + dayExceeds);
    }
}
