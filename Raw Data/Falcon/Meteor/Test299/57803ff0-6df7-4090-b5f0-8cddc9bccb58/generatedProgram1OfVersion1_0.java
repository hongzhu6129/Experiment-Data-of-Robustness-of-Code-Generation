import java.util.Map;

public class SystemInfo {

    public static void main(String[] args) {

        // Get and print system environment variables
        Map<String, String> env = System.getenv();
        System.out.println("System Environment Variables:");
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }
        System.out.println(); // Add a newline for readability

        // Get and print system properties
        System.out.println("System Properties:");
        java.util.Properties props = System.getProperties();
        props.list(System.out); 
    }
}
