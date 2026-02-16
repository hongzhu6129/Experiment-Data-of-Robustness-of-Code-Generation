import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalizedDayOfWeek {

    public static void main(String[] args) {

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the day of the week
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();


        // Print localized day of week names for different locales

        // Example 1: Default Locale (likely your system's locale)
        System.out.println("Day of week (default locale): " + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault()));
        System.out.println("Day of week (default locale - short): " + dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.getDefault()));


        // Example 2: English (US)
        Locale usLocale = Locale.US;
        System.out.println("Day of week (US): " + dayOfWeek.getDisplayName(TextStyle.FULL, usLocale));

        // Example 3: French (France)
        Locale frLocale = Locale.FRANCE;
        System.out.println("Day of week (France): " + dayOfWeek.getDisplayName(TextStyle.FULL, frLocale));

        // Example 4: German (Germany)
        Locale deLocale = Locale.GERMANY;
        System.out.println("Day of week (Germany): " + dayOfWeek.getDisplayName(TextStyle.FULL, deLocale));

        // Example 5: Spanish (Spain)
        Locale esLocale = new Locale("es", "ES"); // or Locale.forLanguageTag("es-ES") from Java 7+
        System.out.println("Day of week (Spain): " + dayOfWeek.getDisplayName(TextStyle.FULL, esLocale));


        // Example 6:  Japanese (Japan)
        Locale jpLocale = Locale.JAPAN;
        System.out.println("Day of week (Japan): " + dayOfWeek.getDisplayName(TextStyle.FULL, jpLocale));

    }
}
