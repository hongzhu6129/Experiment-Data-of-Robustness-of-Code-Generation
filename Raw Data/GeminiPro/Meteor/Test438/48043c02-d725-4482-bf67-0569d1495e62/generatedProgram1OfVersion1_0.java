import java.util.Calendar;
import java.util.Date;

public class CreateDateWithCalendar {

    public static void main(String[] args) {

        // 1. Get a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // 2. Get the current date from the Calendar instance
        Date currentDate = calendar.getTime();

        // 3. Print the current date
        System.out.println("Current Date: " + currentDate);


        // Example of setting a specific date:
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.JANUARY); // Month is 0-indexed (0=January, 1=February, etc.)
        calendar.set(Calendar.DAY_OF_MONTH, 15);

        Date specificDate = calendar.getTime();
        System.out.println("Specific Date: " + specificDate);


    }
}
