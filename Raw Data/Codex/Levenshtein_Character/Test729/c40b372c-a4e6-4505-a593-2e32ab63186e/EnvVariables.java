public class EnvVariables {

    public static void main(String[] args) {

        // Get the value of the "PATH" environment variable
        String path = System.getenv("PATH");
        if (path != null) {
            System.out.println("PATH: " + path);
        } else {
            System.out.println("PATH environment variable not found.");
        }

        // Get the value of the "TEMP" (or "TMP") environment variable
        String temp = System.getenv("TEMP");  // Try TEMP first
        if (temp == null) {
            temp = System.getenv("TMP");     // If TEMP isn't found, try TMP
        }

        if (temp != null) {
            System.out.println("TEMP/TMP: " + temp);
        } else {
            System.out.println("TEMP/TMP environment variable not found.");
        }


        // Get the value of the "USERNAME" environment variable 
        String username = System.getenv("USERNAME"); // On Windows
        if (username == null) {
           username = System.getenv("USER"); // On Linux/macOS/Unix-like
        }

        if (username != null) {
            System.out.println("USERNAME/USER: " + username);
        } else {
            System.out.println("USERNAME/USER environment variable not found.");
        }
    }
}
