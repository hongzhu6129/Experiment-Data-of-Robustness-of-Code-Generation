import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateFormats {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();


        // Format 1:  mm/dd/yyyy
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("MM/dd/yyyy: " + currentDate.format(formatter1));

        // Format 2: Month dd, yyyy
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        System.out.println("Month dd, yyyy: " + currentDate.format(formatter2));


        // Format 3:  dd-MMM-yyyy
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println("dd-MMM-yyyy: " + currentDate.format(formatter3));

        // Format 4: HHmmss
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("HHmmss");
        System.out.println("HHmmss: " + currentTime.format(formatter4));

          // Format 5:  yyyyMMddHHmmss
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        System.out.println("yyyyMMddHHmmss: " + currentDateTime.format(formatter5));



        // Example with specific date and time (if needed):
        LocalDate specificDate = LocalDate.of(2024, 12, 25);
        LocalTime specificTime = LocalTime.of(15, 30, 0); // 3:30 PM
        LocalDateTime specificDateTime = LocalDateTime.of(specificDate, specificTime);

        System.out.println("Specific date (MM/dd/yyyy): " + specificDate.format(formatter1));
        System.out.println("Specific time (HHmmss): " + specificTime.format(formatter4));
        System.out.println("Specific datetime (yyyyMMddHHmmss): " + specificDateTime.format(formatter5));

    }
}
