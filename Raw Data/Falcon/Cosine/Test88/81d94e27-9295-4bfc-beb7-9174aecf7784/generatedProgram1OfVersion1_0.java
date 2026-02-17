import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalizedDayOfWeek {

    public static void main(String[] args) {

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the current day of the week
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();

        // Print the day of the week in different locales
        System.out.println("English (US): " + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.US));
        System.out.println("French (France): " + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.FRANCE));
        System.out.println("German (Germany): " + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.GERMANY));
        System.out.println("Spanish (Spain): " + dayOfWeek.getDisplayName(TextStyle.FULL, Locale. SPAIN));
        System.out.println("Italian (Italy): " + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ITALY));
        System.out.println("Chinese (China): " + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.CHINA));
        System.out.println("Japanese (Japan): " + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.JAPAN));


        // Example for a specific date:
        LocalDate specificDate = LocalDate.of(2024, 12, 25);  // Christmas 2024
        DayOfWeek specificDayOfWeek = specificDate.getDayOfWeek();
        System.out.println("\nChristmas 2024 (German): " + specificDayOfWeek.getDisplayName(TextStyle.FULL, Locale.GERMANY));


        // Different display styles:
        System.out.println("\nDifferent Styles (English):");
        System.out.println("FULL: " + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.US));       //  e.g., "Monday"
        System.out.println("SHORT: " + dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US));     //  e.g., "Mon"
        System.out.println("NARROW: " + dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.US));    //  e.g., "M"


      
    }
}
