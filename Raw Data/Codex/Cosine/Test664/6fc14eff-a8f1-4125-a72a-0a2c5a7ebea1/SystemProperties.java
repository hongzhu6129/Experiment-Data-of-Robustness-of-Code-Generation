public class SystemProperties {

    public static void main(String[] args) {

        // Get and print environment variables
        System.out.println("Environment Variables:");
        java.util.Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }

        System.out.println("\nSystem Properties:");
         // Get and print system properties
        java.util.Properties properties = System.getProperties();
        properties.list(System.out); 
    }
}
