public class EnvVariables {

    public static void main(String[] args) {
        // Get the value of the "PATH" environment variable.
        String path = System.getenv("PATH");
        if (path != null) {
            System.out.println("PATH: " + path);
        } else {
            System.out.println("PATH environment variable not found.");
        }

        // Get the value of the "TEMP" (or "TMP" on some systems) environment variable.
        String temp = System.getenv("TEMP");
        if (temp == null) {
            temp = System.getenv("TMP"); // Try TMP if TEMP is not found
        }
        if (temp != null) {
            System.out.println("TEMP/TMP: " + temp);
        } else {
            System.out.println("TEMP/TMP environment variable not found.");
        }



        // Get the value of the "USERNAME" environment variable (registrant is not a standard environment variable)
        //  "USERNAME" is more common for identifying a user.
        String username = System.getenv("USERNAME"); // Or USER on some systems
         if (username == null) {
            username = System.getenv("USER"); 
        }

        if (username != null) {
            System.out.println("USERNAME/USER: " + username); // It is highly system-dependent
        } else {
            System.out.println("USERNAME/USER environment variable not found.");
        }




        // Demonstrating how to handle a custom environment variable (if you really need "registrant")
        // You would have to set this environment variable yourself.

        String registrant = System.getenv("registrant"); // Case-sensitive!
        if (registrant != null) {
            System.out.println("registrant: " + registrant);
        } else {
            System.out.println("registrant environment variable not found.");
        }
    }
}
