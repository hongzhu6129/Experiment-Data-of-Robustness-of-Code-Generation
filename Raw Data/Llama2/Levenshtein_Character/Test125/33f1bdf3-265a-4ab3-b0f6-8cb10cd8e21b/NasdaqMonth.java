import java.util.Scanner;

public class NasdaqMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the Nasdaq data.
        String nasdaqData = scanner.nextLine();

        // Split the Nasdaq data into an array of strings.
        String[] nasdaqDataSplit = nasdaqData.split(",");

        // Get the month from the Nasdaq data.
        String month = nasdaqDataSplit[0];

        // Print the month.
        System.out.println(month);
    }
}
