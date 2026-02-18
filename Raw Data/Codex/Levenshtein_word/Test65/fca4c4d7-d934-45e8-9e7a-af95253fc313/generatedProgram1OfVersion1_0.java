import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Define date format

        LocalDate currentDate = LocalDate.now();

        System.out.println("Enter a date in yyyy-MM-dd format:");
        String inputDateStr = scanner.nextLine();

        try {
            LocalDate inputDate = LocalDate.parse(inputDateStr, formatter);

            LocalDate oneYearBefore = inputDate.minusYears(1);
            LocalDate oneYearAfter = inputDate.plusYears(1);

            System.out.println("Input Date: " + inputDate.format(formatter));
            System.out.println("One Year Before: " + oneYearBefore.format(formatter));
            System.out.println("One Year After: " + oneYearAfter.format(formatter));


            System.out.println("\nComparison with Current Date (" + currentDate.format(formatter) + "):");

            // Compare one year before with current date
             compareDates(oneYearBefore, currentDate);
             
            //Compare one year after with current date
             compareDates(oneYearAfter, currentDate);
            

        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        } finally{
          scanner.close();
        }

    }

    private static void compareDates(LocalDate date1, LocalDate date2){
        if (date1.isBefore(date2)) {
            System.out.println(date1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + " is before the current date.");
           
        } else if (date1.isAfter(date2)) {
            System.out.println(date1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + " is after the current date.");
        } else {
            System.out.println(date1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + " is the same as the current date.");
        }
    }
}
