import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintCurrentDateAndTime {

    public static void main(String[] args) {
        // Create a SimpleDateFormat object with the desired date and time format
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Get the current date and time
        Date now = new Date();

        // Format the current date and time using the SimpleDateFormat object
        String formattedDate = sdf.format(now);

        // Print the formatted date and time
        System.out.println(formattedDate);
    }
}
