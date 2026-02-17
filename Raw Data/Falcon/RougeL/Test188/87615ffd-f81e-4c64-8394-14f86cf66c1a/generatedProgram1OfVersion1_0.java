import java.util.Calendar;

public class MinimumCalendarValues {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // Get the current year, month, week of year, and day of month
        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH); // Month is 0-indexed (0-11)
        int currentWeekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int currentDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);



        // Minimum values for year, month, week of year, and day of month are fixed:

        int minYear = 1;  // Calendar supports a wide range, but realistically 1 is a sensible minimum.
        int minMonth = 0; // January (0-indexed)
        int minWeekOfYear = 1;
        int minDayOfMonth = 1;

        System.out.println("Current Date Information:");
        System.out.println("Year: " + currentYear);
        System.out.println("Month: " + (currentMonth + 1)); // Add 1 for 1-indexed month display
        System.out.println("Week of Year: " + currentWeekOfYear);
        System.out.println("Day of Month: " + currentDayOfMonth);


        System.out.println("\nMinimum Possible Values:");
        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month: " + (minMonth + 1)); // Add 1 for display
        System.out.println("Minimum Week of Year: " + minWeekOfYear);
        System.out.println("Minimum Day of Month: " + minDayOfMonth);

    }
}
