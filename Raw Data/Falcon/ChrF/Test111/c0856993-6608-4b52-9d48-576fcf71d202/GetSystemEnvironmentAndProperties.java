import java.util.Map;

public class GetSystemEnvironmentAndProperties {

    public static void main(String[] args) {
        // Get system environment variables
        Map<String, String> env = System.getenv();
        System.out.println("System Environment Variables:");
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }

        System.out.println("\n"); // Add a newline for better readability

        // Get system properties
        System.out.println("System Properties:");
        java.util.Properties props = System.getProperties();
        props.list(System.out); // Directly list properties to System.out
    }
}
