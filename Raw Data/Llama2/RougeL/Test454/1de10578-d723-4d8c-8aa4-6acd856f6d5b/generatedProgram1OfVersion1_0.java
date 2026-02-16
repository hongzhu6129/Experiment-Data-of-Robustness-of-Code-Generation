import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CalculateAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your date of birth in YYYY-MM-DD format (e.g., 1990-05-15):");
        String dobString = scanner.nextLine();

        try {
            LocalDate dob = LocalDate.parse(dobString, DateTimeFormatter.ISO_DATE);
            LocalDate now = LocalDate.now();
            Period age = Period.between(dob, now);

            System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");

        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD.");
        }
    }
}
