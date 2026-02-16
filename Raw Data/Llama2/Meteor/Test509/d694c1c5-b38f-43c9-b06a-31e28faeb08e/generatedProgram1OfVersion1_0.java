import java.util.Calendar;

public class MaxValuesFromDate {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // Get the maximum values for year, month, week of year, and day of month.
        // Note: These values are NOT based on the *current* date, but rather 
        // the maximum possible values supported by the Calendar class. 
        // For fields like YEAR, it's a very large number; for MONTH, it's 11
        // (because months are 0-indexed); for WEEK_OF_YEAR and DAY_OF_MONTH, 
        // it depends on the calendar system and specific year/month.

        int maxYear = calendar.getMaximum(Calendar.YEAR);
        int maxMonth = calendar.getMaximum(Calendar.MONTH);  // 0-indexed (0 = January, 11 = December)
        int maxWeekOfYear = calendar.getMaximum(Calendar.WEEK_OF_YEAR); 
        int maxDayOfMonth = calendar.getMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("Maximum Year: " + maxYear);
        System.out.println("Maximum Month (0-indexed): " + maxMonth);
        System.out.println("Maximum Week of Year: " + maxWeekOfYear);
        System.out.println("Maximum Day of Month: " + maxDayOfMonth);


        // To get the max day of the *current* month:
        int maxDayOfCurrentMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Maximum Day of the Current Month: " + maxDayOfCurrentMonth);


        //Example to get maximum week number of specific year (e.g., 2024 which is a leap year):
         calendar.set(Calendar.YEAR, 2024);
         int maxWeekOfYear2024 = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
         System.out.println("Maximum Week of Year 2024: " + maxWeekOfYear2024);
    }
}
