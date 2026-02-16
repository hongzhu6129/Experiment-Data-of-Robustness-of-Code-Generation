public class EnvironmentAndSecurity {

    public static void main(String[] args) {

        // 19. Check for Security Manager
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            System.out.println("A security manager has already been established.");
        } else {
            System.out.println("No security manager has been established.");
        }

        // 90. Get Environment Variables
        String path = System.getenv("PATH");
        String temp = System.getenv("TEMP"); // Or TMP on some systems
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

         //Robust handling of TEMP: Check both TEMP and TMP
         if (temp == null) {
             temp = System.getenv("TMP");
             if (temp != null) {
                 System.out.println("TMP (as TEMP alternative): " + temp);
             } else {
                 System.out.println("Neither TEMP nor TMP environment variables found.");
             }
         }

         //Robust handling of USERNAME: Check both USERNAME and USER
         if(username == null) {
            username = System.getenv("USER");
            if(username != null) {
                System.out.println("USER (as USERNAME alternative): " + username);
            } else {
                System.out.println("Neither USERNAME nor USER environment variables found.");
            }
         }

    }
}
