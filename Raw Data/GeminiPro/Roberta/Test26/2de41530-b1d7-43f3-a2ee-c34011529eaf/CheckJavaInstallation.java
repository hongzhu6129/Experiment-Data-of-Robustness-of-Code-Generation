import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckJavaInstallation {

    public static boolean isJavaInstalled() {
        try {
            // Execute a simple java command
            Process process = Runtime.getRuntime().exec("java -version");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream())); // Read from error stream for version info

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("java version") || line.startsWith("openjdk version")) {
                    return true; // Found java version string
                }
            }

            // Check exit code in case "java -version" doesn't write to error stream.
            int exitCode = process.waitFor();  // Important: Wait for the process to finish
            // Some systems might return 0 even if java isn't present, but this is a reasonable basic check
            if (exitCode == 0) {
                return true;
            }

            return false;

        } catch (IOException | InterruptedException e) {
            return false; // Error executing the command, Java likely not installed
        }
    }

    public static void main(String[] args) {
        if (isJavaInstalled()) {
            System.out.println("Java is installed on this system.");
        } else {
            System.out.println("Java is NOT installed on this system.");
        }
    }
}
