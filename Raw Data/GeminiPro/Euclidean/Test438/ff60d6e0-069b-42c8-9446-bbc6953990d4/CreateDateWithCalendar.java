import java.util.Calendar;
import java.util.Date;

public class CreateDateWithCalendar {

    public static void main(String[] args) {

        // 1. Get a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // 2. Optionally set specific date and time components (if you don't, it defaults to the current date and time)
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER); // Months are 0-indexed (0 = January, 1 = February, etc.)
        calendar.set(Calendar.DAY_OF_MONTH, 26);
        calendar.set(Calendar.HOUR_OF_DAY, 10);  // 24-hour clock
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);

        // 3. Get the Date object from the Calendar
        Date date = calendar.getTime();


        // 4. Print the date (optional)
        System.out.println(date);


        // Example of creating a date for a specific date only (ignoring time components):

        Calendar calendar2 = Calendar.getInstance();
        calendar2.clear(); // Clear all fields
        calendar2.set(2023, Calendar.DECEMBER, 15); // Year, Month, Day
        Date date2 = calendar2.getTime();
        System.out.println(date2);

    }
}
