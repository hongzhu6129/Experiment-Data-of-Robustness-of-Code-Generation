import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class SameDayOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date in yyyy-MM-dd format (e.g., 2024-03-15):");
        String dateString = scanner.nextLine();

        try {
            LocalDate inputDate = LocalDate.parse(dateString, DateTimeFormatter.ISO_DATE);
            DayOfWeek inputDayOfWeek = inputDate.getDayOfWeek();

            LocalDate currentDate = LocalDate.now();
            LocalDate sameDayOfWeekDate = null;


            // Efficiently find the next date (could be today) with the same day of the week
            int daysToAdd = (inputDayOfWeek.getValue() - currentDate.getDayOfWeek().getValue() + 7) % 7;
            sameDayOfWeekDate = currentDate.plusDays(daysToAdd);


            System.out.println("The date " + sameDayOfWeekDate.format(DateTimeFormatter.ISO_DATE) + 
                               " has the same day of the week (" + inputDayOfWeek + 
                               ") as " + dateString);


        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format. Please use yyyy-MM-dd.");
        }
    }
}
