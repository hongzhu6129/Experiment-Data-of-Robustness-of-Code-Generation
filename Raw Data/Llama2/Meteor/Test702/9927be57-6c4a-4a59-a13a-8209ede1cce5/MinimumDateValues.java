import java.util.Calendar;

public class MinimumDateValues {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // Minimum values achievable depend on Calendar implementation.
        // YEAR:  Calendar systems typically have a minimum year.  We'll demonstrate getting it.
        // MONTH: Minimum month is always the first month (e.g., January, usually represented as 0 or 1 depending on the Calendar).
        // WEEK_OF_YEAR/WEEK_OF_MONTH: Minimum is typically 1.
        // DATE/DAY_OF_MONTH: Minimum is always 1.


        // Get the minimum year supported by the Calendar.
        // There's no direct "getMinimumYear()" in Calendar.  We can try setting a very low year and
        // see what the Calendar adjusts it to.  This approach isn't foolproof for all unusual Calendar
        // implementations but works well with Gregorian and similar.
        calendar.set(Calendar.YEAR, Integer.MIN_VALUE);  
        int minYear = calendar.get(Calendar.YEAR);


        // Output the minimum values.
        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month: " + calendar.getMinimum(Calendar.MONTH)); // or January(0 or 1) depending on Calendar implementation
        System.out.println("Minimum Week of Year: " + calendar.getMinimum(Calendar.WEEK_OF_YEAR)); // Usually 1
        System.out.println("Minimum Week of Month: " + calendar.getMinimum(Calendar.WEEK_OF_MONTH)); // Usually 1
        System.out.println("Minimum Date (Day of Month): " + calendar.getMinimum(Calendar.DATE)); // Always 1

        /*  Example to understand Calendar.getMinimum() 
        *  For Gregorian Calendar:
        *  Minimum Year: 1 (or a similarly low value)
        *  Minimum Month: 0 (JANUARY)
        *  Minimum Week of Year: 1
        *  Minimum Week of Month: 0
        *  Minimum Date (Day of Month): 1
        */


    }
}
