import java.util.Map;

public class SystemInfo {

    public static void main(String[] args) {
        // Get System Environment Variables
        Map<String, String> env = System.getenv();

        System.out.println("System Environment Variables:");
        for (Map.Entry<String, String> entry : env.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("\n"); // Add a newline for better readability

        // Get System Properties
        System.getProperties().list(System.out); 
    }
}
