import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDateTime {

    public static void main(String[] args) {
        // Create a SimpleDateFormat object with the desired date and time format
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Get the current date and time
        Date date = new Date();

        // Format the date and time using the SimpleDateFormat object
        String formattedDate = sdf.format(date);

        // Print the formatted date and time
        System.out.println(formattedDate);
    }
}
