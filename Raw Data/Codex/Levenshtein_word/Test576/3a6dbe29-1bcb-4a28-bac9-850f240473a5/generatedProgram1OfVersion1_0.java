public class CheckSecurityManagerAndEnvironment {

    public static void main(String[] args) {

        // 11. Check if a security manager is established
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            System.out.println("A security manager has been established.");
        } else {
            System.out.println("No security manager has been established.");
        }


        // 90. Get environment variables
        String path = System.getenv("PATH");
        String temp = System.getenv("TEMP"); // Or TMP on some systems
        String username = System.getenv("USERNAME"); // Or USER on some systems


        // Print environment variables (handle null in case they are not set)
        System.out.println("PATH: " + (path != null ? path : "Not set"));
        System.out.println("TEMP: " + (temp != null ? temp : "Not set"));
        System.out.println("USERNAME: " + (username != null ? username : "Not set"));

    }
}
