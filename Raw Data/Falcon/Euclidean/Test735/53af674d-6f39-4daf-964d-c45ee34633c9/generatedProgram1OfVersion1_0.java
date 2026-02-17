import java.util.Calendar;

public class MaxCalendarValues {

    public static void main(String[] args) {

        // Get a default calendar instance
        Calendar calendar = Calendar.getInstance();

        // Get the current year, month, week of year, and day of year
        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH); // Month is 0-indexed (0-11)
        int currentWeekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int currentDayOfYear = calendar.get(Calendar.DAY_OF_YEAR);

        // Get the maximum values for year, month, week of year, and day of year
        int maxYear = calendar.getMaximum(Calendar.YEAR); //  A very large value effectively.
        int maxMonth = calendar.getMaximum(Calendar.MONTH); // Always 11 (December)
        int maxWeekOfYear = calendar.getMaximum(Calendar.WEEK_OF_YEAR);  // 52 or 53 depending on the year.
        int maxDayOfYear = calendar.getMaximum(Calendar.DAY_OF_YEAR); // 365 or 366


        System.out.println("Current Date Information:");
        System.out.println("Year: " + currentYear);
        System.out.println("Month: " + (currentMonth + 1)); // Add 1 to adjust to 1-12 format
        System.out.println("Week of Year: " + currentWeekOfYear);
        System.out.println("Day of Year: " + currentDayOfYear);



        System.out.println("\nMaximum Values:");
        System.out.println("Max Year: " + maxYear);
        System.out.println("Max Month: " + (maxMonth + 1));  // Outputting 12 for clarity.
        System.out.println("Max Week of Year: " + maxWeekOfYear);
        System.out.println("Max Day of Year: " + maxDayOfYear);

    }
}
