public class SystemInfo {

    public static void main(String[] args) {

        // Get System Environment Variables
        System.out.println("System Environment Variables:");
        java.util.Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }
        System.out.println(); // Add a blank line for separation


        // Get System Properties
        System.out.println("System Properties:");
        java.util.Properties props = System.getProperties();
        props.list(System.out); // Directly print to the console using list()
    }
}
