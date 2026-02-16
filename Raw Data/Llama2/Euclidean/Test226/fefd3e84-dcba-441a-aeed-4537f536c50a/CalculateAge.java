import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CalculateAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birthdate in YYYY-MM-DD format (e.g., 1990-12-25):");

        String birthdateString = scanner.nextLine();

        try {
            LocalDate birthdate = LocalDate.parse(birthdateString, DateTimeFormatter.ISO_DATE);
            LocalDate currentDate = LocalDate.now();

            Period age = Period.between(birthdate, currentDate);

            System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");

        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format. Please use YYYY-MM-DD.");
        } 
    }
}
