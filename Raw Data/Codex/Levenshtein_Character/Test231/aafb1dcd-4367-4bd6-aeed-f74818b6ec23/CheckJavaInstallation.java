import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckJavaInstallation {

    public static boolean isJavaInstalled() {
        try {
            // Execute 'java -version' command
            Process process = Runtime.getRuntime().exec("java -version");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream())); // Read from error stream

            String line;
            while ((line = reader.readLine()) != null) {
                // Check if the line contains "java version" or "openjdk version"
                if (line.toLowerCase().contains("java version") || line.toLowerCase().contains("openjdk version")) {
                    return true; 
                }
            }

            //  Check exit code (0 usually means success).  Might be platform-dependent.
            int exitCode = process.waitFor();
            if(exitCode == 0) {
                 return true; //Likely Java is installed, even if version string not as expected.
            }

            return false; // Java likely not found or not executable.

        } catch (IOException | InterruptedException e) {
            return false; // Exception during execution indicates Java might not be properly installed.
        }
    }

    public static void main(String[] args) {
        if (isJavaInstalled()) {
            System.out.println("Java is installed on your computer.");
        } else {
            System.out.println("Java is NOT installed on your computer.");
        }
    }
}
