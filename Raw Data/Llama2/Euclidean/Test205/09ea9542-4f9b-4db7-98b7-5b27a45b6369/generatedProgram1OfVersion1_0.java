import java.util.Calendar;

public class MaxCalendarValues {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH); // Month is 0-indexed (0=Jan, 1=Feb, etc.)
        int currentWeekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int currentDayOfYear = calendar.get(Calendar.DAY_OF_YEAR);


        // Maximum values for year, month, week of year, and day of year:

        int maxYear = calendar.getMaximum(Calendar.YEAR); //  Large value representing a far-future year
        int maxMonth = calendar.getMaximum(Calendar.MONTH); // 11 (December)
        int maxWeekOfYear = calendar.getMaximum(Calendar.WEEK_OF_YEAR); // 52 or 53 depending on the year
        int maxDayOfYear = calendar.getMaximum(Calendar.DAY_OF_YEAR);  // 365 or 366


        System.out.println("Current Year: " + currentYear);
        System.out.println("Maximum Year: " + maxYear);

        System.out.println("Current Month (0-indexed): " + currentMonth);
        System.out.println("Maximum Month (0-indexed): " + maxMonth);

        System.out.println("Current Week of Year: " + currentWeekOfYear);
        System.out.println("Maximum Week of Year: " + maxWeekOfYear);

        System.out.println("Current Day of Year: " + currentDayOfYear);
        System.out.println("Maximum Day of Year: " + maxDayOfYear);
    }
}
