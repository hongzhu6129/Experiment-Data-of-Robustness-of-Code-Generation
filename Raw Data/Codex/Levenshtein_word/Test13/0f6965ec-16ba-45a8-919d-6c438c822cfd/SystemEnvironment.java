import java.util.Map;
import java.util.Properties;

public class SystemEnvironment {

    public static void main(String[] args) {

        // Get system properties
        Properties systemProperties = System.getProperties();
        System.out.println("System Properties:");
        for (String propertyName : systemProperties.stringPropertyNames()) {
            String propertyValue = systemProperties.getProperty(propertyName);
            System.out.println(propertyName + " = " + propertyValue);
        }

        System.out.println("\n"); // Add a newline for better readability

        // Get environment variables
        Map<String, String> environmentVariables = System.getenv();
        System.out.println("Environment Variables:");
        for (Map.Entry<String, String> entry : environmentVariables.entrySet()) {
            String variableName = entry.getKey();
            String variableValue = entry.getValue();
            System.out.println(variableName + " = " + variableValue);
        }
    }
}
