public class EnvironmentAndSecurity {

    public static void main(String[] args) {

        // Check for Security Manager
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            System.out.println("Security Manager is present.");
        } else {
            System.out.println("Security Manager is not present.");
        }

        // Get Environment Variables
        System.out.println("PATH: " + System.getenv("PATH"));
        System.out.println("TEMP: " + System.getenv("TEMP")); // Or TMP on some systems
        System.out.println("USERNAME: " + System.getenv("USERNAME")); // or USER on some systems


        //More robust approach for cross-platform compatibility:
        String path = System.getenv("PATH");
        if(path == null) path = System.getenv("Path"); // Windows sometimes has capitalized names

        String temp = System.getenv("TEMP"); 
        if(temp == null) temp = System.getenv("TMP");

        String username = System.getenv("USERNAME");
        if(username == null) username = System.getenv("USER");

        System.out.println("\nMore robust approach:");
        System.out.println("PATH: " + path);
        System.out.println("TEMP/TMP: " + temp);
        System.out.println("USERNAME/USER: " + username);




    }
}
