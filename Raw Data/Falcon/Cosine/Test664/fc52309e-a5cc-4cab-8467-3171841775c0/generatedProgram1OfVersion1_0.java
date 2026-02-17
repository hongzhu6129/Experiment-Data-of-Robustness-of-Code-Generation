import java.util.Map;

public class SystemInfo {

    public static void main(String[] args) {

        // Get System Environment Variables
        Map<String, String> env = System.getenv();
        System.out.println("System Environment Variables:");
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }
        System.out.println(); // Add an empty line for better readability


        // Get System Properties
        System.out.println("System Properties:");
        java.util.Properties props = System.getProperties();
        props.list(System.out); // Directly print properties using the built-in list method
    }
}

