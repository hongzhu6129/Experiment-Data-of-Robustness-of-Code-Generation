public class EnvironmentAndSecurityManager {

    public static void main(String[] args) {

        // 25. Check for Security Manager
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            System.out.println("A security manager has been established.");
        } else {
            System.out.println("No security manager has been established.");
        }

        // 90. Get environment variables
        String path = System.getenv("PATH");
        String temp = System.getenv("TEMP"); // On Windows
        String tmp = System.getenv("TMP");   // On some other systems (e.g., Linux)
        String username = System.getenv("USERNAME"); // On Windows


        System.out.println("PATH: " + path);


        if (temp != null) {
            System.out.println("TEMP: " + temp);
        } else if (tmp != null) {
            System.out.println("TMP: " + tmp); // Use TMP if TEMP isn't found
        } else {
            System.out.println("Neither TEMP nor TMP environment variable found.");
        }

        System.out.println("USERNAME: " + username);


        // More robust way to get temp directory (handles OS differences better)
        String tempDir = System.getProperty("java.io.tmpdir");
        System.out.println("Temporary Directory (using java.io.tmpdir): " + tempDir);
    }
}
