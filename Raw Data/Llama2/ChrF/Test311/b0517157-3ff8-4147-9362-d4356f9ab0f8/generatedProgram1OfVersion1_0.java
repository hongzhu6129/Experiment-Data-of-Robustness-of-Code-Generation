import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringToDateAndTime {

    public static void main(String[] args) {

        // String to Date and Time
        String dateTimeString = "2023-10-27T10:30:00"; // Example ISO-8601 format
        String dateString = "2023-10-27";             // Example date-only
        String timeString = "10:30:00";             // Example time-only


        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, dateTimeFormatter);
            System.out.println("Date and Time: " + dateTime);

            DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
            LocalDate date = LocalDate.parse(dateString, dateFormatter);
            System.out.println("Date only: " + date);

            DateTimeFormatter timeFormatter = DateTimeFormatter.ISO_LOCAL_TIME;
            LocalTime time = LocalTime.parse(timeString, timeFormatter);
            System.out.println("Time only: " + time);


            //Custom format example:
            DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
            String customDateString = "10/27/2023 10:30:00";
            LocalDateTime customDateTime = LocalDateTime.parse(customDateString, customFormatter);
            System.out.println("Custom formatted date and time: " + customDateTime);


        } catch (DateTimeParseException e) {
            System.err.println("Error parsing date/time: " + e.getMessage());
        }



        // Date and Time to String
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // Example format
        String formattedDateTime = currentDateTime.format(formatter);
        String formattedDate = currentDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String formattedTime = currentTime.format(DateTimeFormatter.ISO_LOCAL_TIME);

        System.out.println("Formatted Date and Time: " + formattedDateTime);
        System.out.println("Formatted Date: " + formattedDate);
        System.out.println("Formatted Time: " + formattedTime);

    }
}
