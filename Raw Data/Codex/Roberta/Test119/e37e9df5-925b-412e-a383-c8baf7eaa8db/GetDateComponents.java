import java.util.Calendar;

public class GetDateComponents {

    public static void main(String[] args) {
        // Get an instance of the default calendar (typically Gregorian)
        Calendar calendar = Calendar.getInstance();

        // Get year, month, week of year, and day of month
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Month is 0-indexed, so add 1
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);


        // Print the results
        System.out.println("Current Date Details:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Week of Year: " + weekOfYear);
        System.out.println("Day of Month: " + dayOfMonth);


        //Demonstrate getting the day of the week (e.g., Sunday=1, Monday=2, etc.)
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of Week (1=Sunday, 2=Monday...): " + dayOfWeek);


    }
}
