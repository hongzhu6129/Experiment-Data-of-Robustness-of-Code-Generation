import java.util.Calendar;
import java.util.Date;

public class FocusDate {

    public static void main(String[] args) {

        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Create a Date object (you can replace this with any Date)
        Date date = new Date(); // Current date and time

        // Set the Calendar's time to the Date object's time
        calendar.setTime(date);

        // Now you can "focus" on different parts of the date

        // Example 1: Focus on the year
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Year: " + year);

        // Example 2: Focus on the month (0-indexed, January is 0)
        int month = calendar.get(Calendar.MONTH);
        System.out.println("Month: " + (month + 1)); // Add 1 for human-readable month

        // Example 3: Focus on the day of the month
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Day of Month: " + dayOfMonth);

        // Example 4: Focus on the hour of the day (in 24-hour format)
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println("Hour of Day: " + hourOfDay);


        // Example 5: Set a specific part of the date (e.g., set the year to 2025)
        calendar.set(Calendar.YEAR, 2025);
        Date newDate = calendar.getTime();  // Get the updated Date object
        System.out.println("New Date: " + newDate);



        // ... you can focus on other parts of the date similarly (day of week, minute, second, etc.)

    }
}
