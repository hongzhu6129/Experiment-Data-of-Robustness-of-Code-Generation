import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Define date format

        LocalDate date1 = null;
        LocalDate date2 = null;

        // Input validation loop for date1
        while (date1 == null) {
            System.out.print("Enter the first date (yyyy-MM-dd): ");
            String date1Str = scanner.nextLine();
            try {
                date1 = LocalDate.parse(date1Str, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use yyyy-MM-dd.");
            }
        }


        // Input validation loop for date2
        while (date2 == null) {
            System.out.print("Enter the second date (yyyy-MM-dd): ");
            String date2Str = scanner.nextLine();
            try {
                date2 = LocalDate.parse(date2Str, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use yyyy-MM-dd.");
            }
        }


        Period period = Period.between(date1, date2); // Calculate the period between dates


        int years = period.getYears();
        int months = period.getMonths();


        System.out.println("Difference: " + years + " years, " + months + " months");


        scanner.close();



    }
}
