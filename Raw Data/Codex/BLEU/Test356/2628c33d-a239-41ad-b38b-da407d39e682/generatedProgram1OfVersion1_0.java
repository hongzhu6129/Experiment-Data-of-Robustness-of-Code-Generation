public class EnvironmentAndSecurityManager {

    public static void main(String[] args) {

        // 27. Check for Security Manager
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            System.out.println("A security manager has been established.");
        } else {
            System.out.println("No security manager has been established.");
        }

        // 90. Get Environment Variables
        System.out.println("Path: " + System.getenv("PATH")); // Or Path, depending on OS
        System.out.println("Temp: " + System.getenv("TEMP")); // Or TMP
        System.out.println("Username: " + System.getenv("USERNAME")); // Or USER
    }
}
