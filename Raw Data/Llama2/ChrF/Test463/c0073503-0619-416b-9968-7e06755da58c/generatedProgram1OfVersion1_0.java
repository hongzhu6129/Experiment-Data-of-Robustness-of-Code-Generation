public class EnvironmentAndSecurityManager {

    public static void main(String[] args) {

        // 18. Check if a SecurityManager is established
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            System.out.println("A SecurityManager has been established.");
        } else {
            System.out.println("No SecurityManager has been established.");
        }

        // 90. Get environment variables
        String path = System.getenv("PATH");
        String temp = System.getenv("TEMP");  // Or TMP on some systems
        String username = System.getenv("USERNAME"); // Or USER on some systems


        if (path != null) {
            System.out.println("PATH: " + path);
        } else {
            System.out.println("PATH environment variable not found.");
        }


        if (temp != null) {
            System.out.println("TEMP: " + temp);
        } else {
            System.out.println("TEMP environment variable not found.");
        }


        if (username != null) {
            System.out.println("USERNAME: " + username);
        } else {
            System.out.println("USERNAME environment variable not found.");
        }
    }
}
