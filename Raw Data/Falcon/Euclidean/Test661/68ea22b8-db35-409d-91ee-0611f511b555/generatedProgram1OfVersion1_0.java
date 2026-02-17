import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter {

    public static void main(String[] args) {
        // String to Date conversion
        String dateString = "2023-10-27 10:30:00";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 

        try {
            Date date = dateFormat.parse(dateString);
            System.out.println("Converted Date: " + date);
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }


        // String to Time conversion (assuming time is part of the date string)
        String timeString = "14:45:15"; // Example time string
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

        try {
            Date time = timeFormat.parse(timeString);  // Parses the time part
            System.out.println("Converted Time: " + time); //  Note: This prints the date as Jan 1, 1970 + the time as that's the default when only time is provided.

             // To get just the time part for display (more useful):
            SimpleDateFormat outputTimeFormat = new SimpleDateFormat("HH:mm:ss");
            String formattedTime = outputTimeFormat.format(time);
            System.out.println("Formatted Time: " + formattedTime);

        } catch (ParseException e) {
            System.out.println("Error parsing time: " + e.getMessage());
        }



        // Date to String conversion
        Date currentDate = new Date(); // Current date and time
        DateFormat outputDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String convertedDateString = outputDateFormat.format(currentDate);
        System.out.println("Converted Date String: " + convertedDateString);



        // Time to String conversion (extract time from a Date object)
        DateFormat outputTimeFormat2 = new SimpleDateFormat("HH:mm:ss"); // Format for time
        String convertedTimeString = outputTimeFormat2.format(currentDate);  // Get time from currentDate
        System.out.println("Converted Time String: " + convertedTimeString);



    }
}
