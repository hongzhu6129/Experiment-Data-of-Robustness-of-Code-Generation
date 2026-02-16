import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first date (yyyy-MM-dd):");
        String date1String = scanner.nextLine();

        System.out.println("Enter the second date (yyyy-MM-dd):");
        String date2String = scanner.nextLine();

        try {
            LocalDate date1 = LocalDate.parse(date1String, DateTimeFormatter.ISO_DATE);
            LocalDate date2 = LocalDate.parse(date2String, DateTimeFormatter.ISO_DATE);

            LocalDate earlierDate = date1.isBefore(date2) ? date1 : date2;
            LocalDate laterDate = date1.isAfter(date2) ? date1 : date2;

            int yearDifference = laterDate.getYear() - earlierDate.getYear();


            System.out.println("Earlier date: " + earlierDate.format(DateTimeFormatter.ISO_DATE));

            System.out.println("Years between (inclusive):");
            for (int year = earlierDate.getYear(); year <= laterDate.getYear(); year++) {
                System.out.println(year);
            }


        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format. Please use yyyy-MM-dd.");
        }
    }
}
