import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormats {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();


        // Format 1:  MM/DD/YYYY  (e.g., 10/27/2023)
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = currentDate.format(formatter1);
        System.out.println("MM/dd/yyyy: " + formattedDate1);

        // Format 2: Month DD, YYYY (e.g., October 27, 2023)
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String formattedDate2 = currentDate.format(formatter2);
        System.out.println("MMMM dd, yyyy: " + formattedDate2);

        // Format 3:  DDD YYYY   (e.g., 300 2023)
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("DDD yyyy");
        String formattedDate3 = currentDate.format(formatter3);
        System.out.println("DDD yyyy: " + formattedDate3);


        // Format 4: MM/DD/YY HH:MM:SS (e.g. 10/27/23 15:30:45)  
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("MM/dd/yy HH:mm:ss");
        String formattedDateTime1 = currentDateTime.format(formatter4);
        System.out.println("MM/dd/yy HH:mm:ss: " + formattedDateTime1);


    }
}
