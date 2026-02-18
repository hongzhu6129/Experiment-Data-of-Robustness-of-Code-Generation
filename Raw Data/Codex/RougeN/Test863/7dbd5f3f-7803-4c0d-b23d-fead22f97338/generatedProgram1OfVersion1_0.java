public class EnvironmentAndSecurityManager {

    public static void main(String[] args) {

        // 32. Check for Security Manager
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            System.out.println("A security manager has been established.");
        } else {
            System.out.println("No security manager has been established.");
        }

        System.out.println(); // Add a newline for better readability


        // 90. Get Environment Variables
        System.out.println("Path: " + System.getenv("Path")); // Note: Case-sensitive on Windows
        System.out.println("Temp: " + System.getenv("TEMP"));  // Usually uppercase on Windows
        System.out.println("Registrant (likely not a standard environment variable): " + System.getenv("registrant")); 

        /*  Important Note about "registrant":
            There's no standard "registrant" environment variable in Java or common OSs. 
            If you're expecting a specific variable, make sure its name is correct 
            and it's set in your system's environment.  The above code will just print 
            "null" if "registrant" isn't defined.  
         */
    }
}
