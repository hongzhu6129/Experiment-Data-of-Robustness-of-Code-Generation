import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Split the line by whitespace (or other delimiters if needed)
                String[] parts = line.split("\\s+"); // Split by whitespace

                for (String part : parts) {
                    try {
                        int num = Integer.parseInt(part);
                        // Process the integer if parsing is successful
                        System.out.println("Parsed integer: " + num); 
                    } catch (NumberFormatException e) {
                        // Handle the error gracefully, e.g., print an error message or skip the invalid part.
                        System.err.println("Invalid integer format: " + part);
                    }
                }

            }
        } finally {
            scanner.close();
        }
    }
}
