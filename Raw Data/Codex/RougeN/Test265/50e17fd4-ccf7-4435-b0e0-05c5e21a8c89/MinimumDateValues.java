import java.util.Calendar;

public class MinimumDateValues {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); // Get the current date and time

        // Get the minimum values
        int minYear = calendar.getActualMinimum(Calendar.YEAR);
        int minMonth = calendar.getActualMinimum(Calendar.MONTH);
        int minWeekOfYear = calendar.getActualMinimum(Calendar.WEEK_OF_YEAR);
        int minDayOfMonth = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        int minDayOfYear = calendar.getActualMinimum(Calendar.DAY_OF_YEAR);  // Added for Day of Year
        int minDayOfWeek = calendar.getActualMinimum(Calendar.DAY_OF_WEEK); // Added for Day of Week


        // Print the minimum values
        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month (0-indexed): " + minMonth);
        System.out.println("Minimum Week of Year: " + minWeekOfYear);
        System.out.println("Minimum Day of Month: " + minDayOfMonth);
        System.out.println("Minimum Day of Year: " + minDayOfYear);  //Output for Day of Year
        System.out.println("Minimum Day of Week (1-indexed, Sunday=1): " + minDayOfWeek);  //Output for Day of Week


        /* 
        Note on Month values:  Calendar.MONTH is zero-indexed.  Meaning 0 = January, 1 = February, etc.
        The minimum value will always be 0 (January).

        Note on Week of Year:  This can vary depending on locale and Calendar settings.

        Note on Day of Month/Year/Week: Minimum is always 1 (except for potentially week of year).
         */
    }
}
