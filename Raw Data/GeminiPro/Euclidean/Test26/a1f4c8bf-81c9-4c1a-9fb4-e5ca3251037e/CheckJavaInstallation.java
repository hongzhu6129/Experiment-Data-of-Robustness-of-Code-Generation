import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckJavaInstallation {

    public static boolean isJavaInstalled() {
        try {
            Process process = Runtime.getRuntime().exec("java -version");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream())); // Read from error stream for version info

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("java version") || line.startsWith("openjdk version")) {
                    return true;
                }
            }

            // Check exit code for cases where java isn't found (e.g., not in PATH)
            int exitCode = process.waitFor();
             return exitCode == 0; // 0 usually means success (but it might still not have Java installed correctly)
        } catch (IOException | InterruptedException e) {
            return false;  // Exception thrown: likely Java is not accessible/installed
        }
    }

    public static void main(String[] args) {
        if (isJavaInstalled()) {
            System.out.println("Java is installed on your system.");
        } else {
            System.out.println("Java is not installed or not accessible in your system's PATH.");
        }
    }
}
