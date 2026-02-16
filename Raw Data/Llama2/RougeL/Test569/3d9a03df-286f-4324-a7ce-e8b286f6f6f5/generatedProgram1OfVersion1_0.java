public class CheckSecurityManagerAndEnvironment {

    public static void main(String[] args) {

        // 12. Check for Security Manager
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            System.out.println("Security Manager is present.");
        } else {
            System.out.println("Security Manager is NOT present.");
        }

        // 90. Get Environment Variables
        String path = System.getenv("PATH");
        String temp = System.getenv("TEMP"); // On Windows 
        String username = System.getenv("USERNAME"); // On Windows

        // Cross-platform temp directory:
        String tmpDir = System.getProperty("java.io.tmpdir");


        // Print the values (handle null in case they aren't set)
        System.out.println("PATH: " + (path != null ? path : "Not set")); 
        System.out.println("TEMP: " + (temp != null ? temp : "Not set")); 
        System.out.println("USERNAME: " + (username != null ? username : "Not set"));

        // Cross-platform temp:
        System.out.println("Temp Directory (java.io.tmpdir): " + tmpDir);


        //  For USERNAME on other systems (like macOS/Linux) typically "USER"
        String user = System.getenv("USER");
        if(user != null) {
             System.out.println("USER: " + user);
        }
    }
}
