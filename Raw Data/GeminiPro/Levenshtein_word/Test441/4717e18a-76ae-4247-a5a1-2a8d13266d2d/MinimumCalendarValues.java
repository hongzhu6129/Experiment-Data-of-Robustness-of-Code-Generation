import java.util.Calendar;

public class MinimumCalendarValues {

    public static void main(String[] args) {
        // Get a default calendar instance (represents current date and time)
        Calendar calendar = Calendar.getInstance();

        // Get minimum values for different fields
        int minYear = calendar.getActualMinimum(Calendar.YEAR);
        int minMonth = calendar.getActualMinimum(Calendar.MONTH);
        int minWeekOfYear = calendar.getActualMinimum(Calendar.WEEK_OF_YEAR);  // Note: Week of year can vary
        int minDayOfMonth = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        int minDayOfYear = calendar.getActualMinimum(Calendar.DAY_OF_YEAR); // Added for completeness

        // Output the minimum values
        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month (0-indexed): " + minMonth); // January is 0
        System.out.println("Minimum Week of Year: " + minWeekOfYear);
        System.out.println("Minimum Day of Month: " + minDayOfMonth);
         System.out.println("Minimum Day of Year: " + minDayOfYear);

        // Clarify the meaning of minimum week of year (it can depend on Calendar rules)
        System.out.println("Note: Minimum Week of Year may vary based on Calendar rules (first week containing Jan 1st, etc.).");



        // Example to show how the "minimal" week of year might appear:
        calendar.set(Calendar.MONTH, Calendar.JANUARY); // set to January
        calendar.set(Calendar.DAY_OF_MONTH, 1);       // set to 1st day of January
        int weekOfYearForJan1st = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println("Week of Year for January 1st of this year: " + weekOfYearForJan1st);

    }
}
