public class SystemProperties {

    public static void main(String[] args) {

        // 28. Check for Security Manager
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            System.out.println("A security manager has been established.");
        } else {
            System.out.println("No security manager has been established.");
        }


        // 90. Get System Properties (path, temp, username)
        System.out.println("\nSystem Properties:");

        String path = System.getProperty("path");  // Or "java.library.path" for a more specific library path.  Note that the "path" environment variable and java.library.path are related but distinct.
        if (path != null) {
            System.out.println("path: " + path);
        } else {
            System.out.println("path property not found.");
        }

        String temp = System.getProperty("java.io.tmpdir"); // Correct property for temp directory
        if (temp != null) {
            System.out.println("temp: " + temp);
        } else {
            System.out.println("temp property not found.");
        }


        String username = System.getProperty("user.name");
        if (username != null) {
            System.out.println("username: " + username);
        } else {
            System.out.println("username property not found.");
        }
    }
}
