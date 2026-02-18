import java.util.Calendar;
import java.util.GregorianCalendar;

public class MaxCalendarValues {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(); // Use GregorianCalendar for better accuracy

        // Get the current date components
        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH); // Month is 0-indexed (0 = January)
        int currentWeekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int currentDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);


        // Maximum values
        int maxYear = calendar.getMaximum(Calendar.YEAR);  //  No practical limit in GregorianCalendar.  A large value is returned.
        int maxMonth = calendar.getMaximum(Calendar.MONTH); //  Always 11 (December is the 11th month starting from 0)
        int maxWeekOfYear = calendar.getMaximum(Calendar.WEEK_OF_YEAR); // 52 or 53 depending on the year
        int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // Depends on the current month and year

        System.out.println("Current Date Information:");
        System.out.println("Year: " + currentYear);
        System.out.println("Month: " + (currentMonth + 1)); // Add 1 to adjust to 1-based month
        System.out.println("Week of Year: " + currentWeekOfYear);
        System.out.println("Day of Month: " + currentDayOfMonth);

        System.out.println("\nMaximum Values:");
        System.out.println("Max Year: " + maxYear);
        System.out.println("Max Month: " + (maxMonth + 1)); // Add 1 for 1-based month display
        System.out.println("Max Week of Year: " + maxWeekOfYear);
        System.out.println("Max Day of Month (for current month): " + maxDayOfMonth);


    }
}
