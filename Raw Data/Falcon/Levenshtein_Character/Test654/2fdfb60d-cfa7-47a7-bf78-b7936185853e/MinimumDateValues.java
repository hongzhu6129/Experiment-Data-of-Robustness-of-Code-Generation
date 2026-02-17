import java.util.Calendar;

public class MinimumDateValues {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // Minimum year is 1 (Gregorian calendar)
        int minYear = 1;

        // Minimum month is 0 (January) - Note: Calendar months are 0-indexed
        int minMonth = Calendar.JANUARY; 

        // Minimum week of month is 1 (first week)
        calendar.set(Calendar.DAY_OF_MONTH, 1);  // Set to the first day of the month
        int minWeekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

        // Minimum day of month is 1
        int minDayOfMonth = 1;

        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month (0-indexed): " + minMonth); // Output as 0-indexed for consistency with Calendar
        System.out.println("Minimum Week of Month: " + minWeekOfMonth);
        System.out.println("Minimum Day of Month: " + minDayOfMonth);
    }
}
