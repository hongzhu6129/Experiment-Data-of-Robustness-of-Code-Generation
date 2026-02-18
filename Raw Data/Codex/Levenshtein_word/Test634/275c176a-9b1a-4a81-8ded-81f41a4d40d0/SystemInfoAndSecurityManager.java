public class SystemInfoAndSecurityManager {

    public static void main(String[] args) {

        // 4. Get current system environment and system properties
        System.out.println("System Environment:");
        java.util.Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }

        System.out.println("\nSystem Properties:");
        java.util.Properties props = System.getProperties();
        props.list(System.out);


        // 89. Check if a security manager is established
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            System.out.println("\nA security manager has already been established.");
            // Example:  Try something that might be restricted
            try {
                System.exit(0); // Just an example, don't actually exit in real code unless intended!
            } catch (SecurityException e) {
                System.out.println("Caught SecurityException: " + e.getMessage()); 
            }
        } else {
            System.out.println("\nA security manager has not been established.");
        }
    }
}
