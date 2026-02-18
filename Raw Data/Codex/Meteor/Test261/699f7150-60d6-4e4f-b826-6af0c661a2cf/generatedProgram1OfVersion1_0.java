public class EnvVariables {

    public static void main(String[] args) {

        // Get the value of the "PATH" environment variable
        String path = System.getenv("PATH");
        if (path != null) {
            System.out.println("PATH: " + path);
        } else {
            System.out.println("PATH environment variable not found.");
        }

        // Get the value of the "TEMP" (or "TMP" on some systems) environment variable
        String temp = System.getenv("TEMP");
        if (temp == null) {
             temp = System.getenv("TMP"); // Try TMP if TEMP isn't found
        }

        if (temp != null) {
            System.out.println("TEMP/TMP: " + temp);
        } else {
            System.out.println("TEMP/TMP environment variable not found.");
        }


        // Get the value of the "USERNAME" (or "USER" on some systems) environment variable.
        String username = System.getenv("USERNAME");
        if (username == null) {
            username =  System.getenv("USER"); // Try USER if USERNAME isn't found (e.g., Linux/macOS)
        }


        if (username != null) {
            System.out.println("USERNAME/USER: " + username);
        } else {
            System.out.println("USERNAME/USER environment variable not found.");
        }
    }
}
