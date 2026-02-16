public class CheckSecurityManagerAndEnvVariables {

    public static void main(String[] args) {

        // 5. Check if a security manager is established
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            System.out.println("A security manager has been established.");
        } else {
            System.out.println("No security manager has been established.");
        }

        // 90. Get environment variables
        String path = System.getenv("PATH");
        String temp = System.getenv("TEMP"); // Or TMP on some systems
        String username = System.getenv("USERNAME"); // Or USER on some systems like Linux/macOS


        if (path != null) {
            System.out.println("PATH: " + path);
        } else {
            System.out.println("PATH environment variable not found.");
        }


        if (temp != null) {
            System.out.println("TEMP: " + temp);
        } else {
            System.out.println("TEMP environment variable not found."); // Could also try TMP
        }


        if (username != null) {
            System.out.println("USERNAME: " + username); 
        } else {
            System.out.println("USERNAME environment variable not found."); // Could also try USER
        }

    }
}
