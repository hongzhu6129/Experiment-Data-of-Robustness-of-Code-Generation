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
                // Look for specific string indicating Java version
                if (line.startsWith("java version") || line.startsWith("openjdk version")) { 
                    return true;
                }
            }

            // Check exit code in case "java -version" produces no output to error stream but succeeds.
            if (process.waitFor() == 0) {
                return true; //  Likely Java is installed but version info handled differently
            }

        } catch (IOException | InterruptedException e) {
            //  Exception indicates Java is likely NOT installed or accessible.
            return false;
        }
        return false; // Command failed to execute properly
    }

    public static void main(String[] args) {
        if (isJavaInstalled()) {
            System.out.println("Java is installed on your system.");
        } else {
            System.out.println("Java is not installed or not accessible in your system's PATH.");
        }
    }
}




