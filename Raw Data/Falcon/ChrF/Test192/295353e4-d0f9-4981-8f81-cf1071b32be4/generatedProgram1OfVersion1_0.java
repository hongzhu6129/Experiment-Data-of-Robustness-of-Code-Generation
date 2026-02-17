import java.util.Calendar;

public class MinimumDateValues {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // Get the minimum values for year, month, week of year, and day of month
        int minYear = calendar.getActualMinimum(Calendar.YEAR);
        int minMonth = calendar.getActualMinimum(Calendar.MONTH);
        int minWeekOfYear = calendar.getActualMinimum(Calendar.WEEK_OF_YEAR);
        int minDayOfMonth = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);

        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month (0-indexed): " + minMonth);
        System.out.println("Minimum Week of Year: " + minWeekOfYear);
        System.out.println("Minimum Day of Month: " + minDayOfMonth);

        // Demonstrate how to set the Calendar to these minimums
        calendar.set(Calendar.YEAR, minYear);  // Would only be relevant if you could go back in time below Java epoch
        calendar.set(Calendar.MONTH, minMonth);
        calendar.set(Calendar.DAY_OF_MONTH, minDayOfMonth); // Sets to the 1st

         // Note that setting WEEK_OF_YEAR directly might not work as expected.

         System.out.println("Calendar set to minimums (month and day only, year is epoch): " + calendar.getTime());


    }
}
