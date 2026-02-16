public class EnvironmentAndSecurityManager {

    public static void main(String[] args) {

        // 10. Check for Security Manager
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            System.out.println("A security manager has been established.");
        } else {
            System.out.println("No security manager has been established.");
        }

        // 90. Get Environment Variables
        System.out.println("PATH: " + System.getenv("PATH"));
        System.out.println("TEMP: " + System.getenv("TEMP"));
        System.out.println("USERNAME: " + System.getenv("USERNAME"));


        // More robust way to handle potentially null environment variables:
        String path = System.getenv("PATH");
        if (path != null) {
            System.out.println("PATH: " + path);
        } else {
            System.out.println("PATH environment variable not set.");
        }


         String temp = System.getenv("TEMP");
        if (temp != null) {
            System.out.println("TEMP: " + temp);
        } else {
            System.out.println("TEMP environment variable not set.");
        }



        String username = System.getenv("USERNAME");
        if (username != null) {
            System.out.println("USERNAME: " + username);
        } else {
            System.out.println("USERNAME environment variable not set.");
        }



    }
}
