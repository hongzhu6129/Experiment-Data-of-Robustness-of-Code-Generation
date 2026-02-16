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
                    return true; // Java is installed
                }
            }
            
            // Check the exit code in case of silent failure (e.g., java not in PATH)
            int exitCode = process.waitFor();
            return exitCode == 0;  //  0 usually means success, but not a guarantee of Java presence. It just means the command executed *something*

        } catch (IOException | InterruptedException e) {
            return false; // Error executing command, Java likely not installed
        }
    }

    public static void main(String[] args) {
        if (isJavaInstalled()) {
            System.out.println("Java is installed on this system.");
        } else {
            System.out.println("Java is not installed on this system.");
        }
    }
}
