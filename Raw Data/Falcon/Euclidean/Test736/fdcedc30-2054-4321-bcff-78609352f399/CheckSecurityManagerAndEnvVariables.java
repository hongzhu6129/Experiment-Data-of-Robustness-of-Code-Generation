public class CheckSecurityManagerAndEnvVariables {

    public static void main(String[] args) {

        // 7. Check if a security manager is established
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            System.out.println("Security Manager is established.");
        } else {
            System.out.println("Security Manager is NOT established.");
        }

        System.out.println("--------------------");

        // 90. Get environment variables
        String path = System.getenv("PATH");
        String temp = System.getenv("TEMP");  // Or System.getenv("TMP") depending on the OS
        String username = System.getenv("USERNAME"); // or USER on some systems


        // Handle potential nulls (environment variables might not be set)
        System.out.println("PATH: " + (path != null ? path : "Not set"));
        System.out.println("TEMP: " + (temp != null ? temp : "Not set"));
        System.out.println("USERNAME: " + (username != null ? username : "Not set"));
    }
}
