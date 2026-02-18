import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;

public class WeeklyDates {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // Loop through the next 12 weeks (adjust as needed)
        for (int i = 0; i < 12; i++) {
            LocalDate firstDayOfWeek = today.with(TemporalAdjusters.firstInNextWeek(DayOfWeek.MONDAY)); // Assuming Monday as the start of the week
            LocalDate lastDayOfWeek = firstDayOfWeek.plusDays(6); // Calculate the last day of the week

            System.out.println("Week " + (i + 1) + ":");
            System.out.println("First day: " + firstDayOfWeek.toString());
            System.out.println("Last day: " + lastDayOfWeek.toString());
            System.out.println();

            today = lastDayOfWeek.plusDays(1); // Move to the next week
        }


        //Alternative approach using WeekFields for different Locale's week definitions:
        System.out.println("Using WeekFields (for locale-specific week definitions):");

        LocalDate now = LocalDate.now();
        WeekFields weekFieldsUS = WeekFields.of(java.util.Locale.US); //Example: US week starts on Sunday
        WeekFields weekFieldsISO = WeekFields.ISO; //ISO Standard (Monday start)

        for (int i = 0; i < 12; i++) {
            LocalDate firstDayUS = now.with(weekFieldsUS.dayOfWeek(), 1);
            LocalDate lastDayUS = now.with(weekFieldsUS.dayOfWeek(), 7);
            
            LocalDate firstDayISO = now.with(weekFieldsISO.dayOfWeek(), 1);
            LocalDate lastDayISO = now.with(weekFieldsISO.dayOfWeek(), 7);


            System.out.println("Week " + (i + 1) + " (US Locale):");
            System.out.println("First day: " + firstDayUS);
            System.out.println("Last day: " + lastDayUS);

            System.out.println("Week " + (i + 1) + " (ISO Standard):");
            System.out.println("First day: " + firstDayISO);
            System.out.println("Last day: " + lastDayISO);
            System.out.println();

            now = lastDayISO.plusDays(1); //Important: increment using ISO to avoid skipping weeks in some locales.
        }

    }
}
