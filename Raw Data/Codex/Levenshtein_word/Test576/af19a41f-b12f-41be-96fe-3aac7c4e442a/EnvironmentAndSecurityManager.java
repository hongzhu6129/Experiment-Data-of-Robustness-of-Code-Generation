public class EnvironmentAndSecurityManager {

    public static void main(String[] args) {

        // 17. Check for Security Manager
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            System.out.println("A security manager has been established.");
        } else {
            System.out.println("No security manager has been established.");
        }

        // 90. Get Environment Variables
        System.out.println("\nEnvironment Variables:");

        String path = System.getenv("PATH");
        if (path != null) {
            System.out.println("PATH: " + path);
        } else {
            System.out.println("PATH environment variable not found.");
        }

        String temp = System.getenv("TEMP"); // Or "TMP" on some systems
        if (temp != null) {
            System.out.println("TEMP: " + temp); 
        } else {
             String tmp = System.getenv("TMP");
             if(tmp != null){
                  System.out.println("TMP: " + tmp);
             }else{
                  System.out.println("TEMP/TMP environment variable not found.");
             }
        }


        String username = System.getenv("USERNAME"); // Or "USER" on some systems
        if (username != null) {
            System.out.println("USERNAME: " + username);
        } else {
            String user = System.getenv("USER");
            if (user != null){
                System.out.println("USER: " + user);
            } else {
                System.out.println("USERNAME/USER environment variable not found.");
            }
        }
    }
}
