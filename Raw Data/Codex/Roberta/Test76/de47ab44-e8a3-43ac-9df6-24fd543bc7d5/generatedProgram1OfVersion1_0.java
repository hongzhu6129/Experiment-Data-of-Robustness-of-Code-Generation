import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrintPartTermDates {

    public static void main(String[] args) {
        // Define the start and end dates of the part term
        LocalDate startDate = LocalDate.parse("2023-01-03");
        LocalDate endDate = LocalDate.parse("2023-03-31");

        // Create a date formatter to format the dates in the desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Print the start and end dates in the desired format
        System.out.println("Start date: " + formatter.format(startDate));
        System.out.println("End date: " + formatter.format(endDate));
    }
}
