import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Split the line into parts based on whitespace
                String[] parts = line.split("\\s+"); // Split by whitespace

                for (String part : parts) {
                    try {
                        int num = Integer.parseInt(part);
                        System.out.println("Integer: " + num);
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid integer: " + part);
                        // Handle the error appropriately, e.g., skip the invalid part,
                        // assign a default value, or terminate the program. 
                        // The choice depends on the specific requirements.

                        // Example of skipping the invalid part:
                        // continue; // goes to the next 'part' in the loop.

                         //Example of terminating for any invalid input
                        // return; //Exits the main method, stopping the program.


                        //Example of assigning a default value:
                        // int num = -1; // Or any other default you want
                        // System.out.println("Using default value for: " + part + " => " + num);

                    }
                }
            }
        } finally {
            scanner.close();
        }
    }
}
