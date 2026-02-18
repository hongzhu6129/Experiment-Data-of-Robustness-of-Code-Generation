import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class GetDayOfWeekPreviousDate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date in yyyy-MM-dd format (e.g., 2024-03-15):");
        String dateString = scanner.nextLine();

        System.out.println("Enter the number of days to go back:");
        int daysToGoBack = scanner.nextInt();

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate specifiedDate = LocalDate.parse(dateString, formatter);
            LocalDate previousDate = specifiedDate.minus(daysToGoBack, ChronoUnit.DAYS);
            DayOfWeek dayOfWeek = previousDate.getDayOfWeek();

            System.out.println("The day of the week " + daysToGoBack + " days before " + dateString + " was: " + dayOfWeek);

        } catch (java.time.format.DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        scanner.close(); 
    }
}
