import java.util.Map;

public class SystemProperties {

    public static void main(String[] args) {

        // Get the system environment
        Map<String, String> env = System.getenv();
        System.out.println("System Environment:");
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }
        System.out.println();


        // Get the system properties
        System.out.println("System Properties:");
        java.util.Properties props = System.getProperties();
        props.list(System.out); // This directly prints the properties to System.out
    }
}
