public class CheckSecurityManagerAndEnvironment {

    public static void main(String[] args) {

        // 2. Check if a security manager is established
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            System.out.println("A security manager has been established.");
        } else {
            System.out.println("No security manager has been established.");
        }

        // 90. Get environment variables
        String path = System.getenv("PATH");
        String temp = System.getenv("TEMP"); // On Windows
        String tmp = System.getenv("TMP");    // On *nix systems (including macOS)
        String username = System.getenv("USERNAME"); // On Windows
        String user = System.getenv("USER");      // On *nix systems (including macOS)


        System.out.println("PATH: " + path);

        // Print whichever temp variable isn't null
        if (temp != null) {
            System.out.println("TEMP: " + temp);
        } else if (tmp != null) {
            System.out.println("TMP: " + tmp);
        } else {
            System.out.println("Neither TEMP nor TMP environment variable found.");
        }


         // Print whichever username variable isn't null
        if (username != null) {
            System.out.println("USERNAME: " + username);
        } else if (user != null) {
            System.out.println("USER: " + user);
        } else {
            System.out.println("Neither USERNAME nor USER environment variable found.");
        }
    }
}
