import java.util.Calendar;

public class MaxDateValues {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // Maximum values attainable directly using Calendar methods
        int maxYear = calendar.getMaximum(Calendar.YEAR); //  The maximum value for YEAR is the largest value returned by Calendar.getInstance().get(YEAR) ever. This will be very large -  292278994
        int maxMonth = calendar.getMaximum(Calendar.MONTH); // Months are 0-indexed, so max is 11 (December)
        int maxWeekOfYear = calendar.getMaximum(Calendar.WEEK_OF_YEAR); // Depends on the year and locale. Usually 52 or 53
        int maxDayOfMonth = calendar.getMaximum(Calendar.DAY_OF_MONTH); // Depends on the month and year (28-31)
        int maxDayOfWeek = calendar.getMaximum(Calendar.DAY_OF_WEEK);  // Always 7 (Saturday)
        int maxDayOfYear = calendar.getMaximum(Calendar.DAY_OF_YEAR);  // 365 or 366 (leap year)



        System.out.println("Maximum Year: " + maxYear);
        System.out.println("Maximum Month (0-indexed): " + maxMonth);  // Remember, this is 0-indexed (0 = January)
        System.out.println("Maximum Week of Year: " + maxWeekOfYear);
        System.out.println("Maximum Day of Month: " + maxDayOfMonth); // For current month in current year
        System.out.println("Maximum Day of Week (1-indexed): " + maxDayOfWeek);  // 1=Sunday, 7=Saturday
        System.out.println("Maximum Day of Year: " + maxDayOfYear);  //  For current year



        // To get the maximum day of the month for a specific month/year:
        calendar.set(Calendar.YEAR, 2024);  // Example: Set to February 2024
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        int maxDayOfMonthSpecific = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Maximum Day of Month for February 2024: " + maxDayOfMonthSpecific);




    }
}
