import java.util.Calendar;

public class MinimumCalendarValues {

    public static void main(String[] args) {
        // Get an instance of the default calendar (GregorianCalendar)
        Calendar calendar = Calendar.getInstance();

        // Get the current year, month, week of year, and day of week
        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH); // Month is 0-indexed (0=Jan, 1=Feb, ...)
        int currentWeekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int currentDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);  // 1=Sunday, 2=Monday, ..., 7=Saturday


        // Minimum value of the year is the minimum possible year value.  Technically, there isn't a minimum for Gregorian calendar, but let's use 1.
        int minYear = 1;

        // Minimum value of the month is January (0)
        int minMonth = Calendar.JANUARY; // Or 0


        // Minimum week of year is 1
        int minWeekOfYear = 1;

        // Minimum day of the week is Sunday (1) as per Java's Calendar
        int minDayOfWeek = Calendar.SUNDAY; // Or 1


        System.out.println("Current Year: " + currentYear);
        System.out.println("Minimum Year: " + minYear);


        System.out.println("Current Month (0-indexed): " + currentMonth);
        System.out.println("Minimum Month (0-indexed): " + minMonth);



        System.out.println("Current Week of Year: " + currentWeekOfYear);
        System.out.println("Minimum Week of Year: " + minWeekOfYear);


        System.out.println("Current Day of Week (1=Sunday,...7=Saturday): " + currentDayOfWeek);
        System.out.println("Minimum Day of Week (1=Sunday,...7=Saturday): " + minDayOfWeek);


    }
}
