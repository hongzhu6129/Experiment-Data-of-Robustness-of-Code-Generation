public class EnvironmentAndSecurityManager {

    public static void main(String[] args) {

        // 16. Check for Security Manager
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            System.out.println("A security manager has already been established.");
        } else {
            System.out.println("No security manager has been established.");
        }

        // 90. Get Environment Variables
        System.out.println("Path: " + System.getenv("Path")); // Windows
        System.out.println("PATH: " + System.getenv("PATH")); // Linux/macOS/etc. (case-sensitive!)
        System.out.println("Temp: " + System.getenv("TEMP")); // Windows
        System.out.println("Tmp: " + System.getenv("TMP"));  // Windows (alternative)
        System.out.println("temp: " + System.getenv("temp")); // Linux/macOS/etc. (case-sensitive!)
        System.out.println("USERNAME: " + System.getenv("USERNAME")); // Windows
        System.out.println("USER: " + System.getenv("USER")); // Linux/macOS/etc.



    }
}
