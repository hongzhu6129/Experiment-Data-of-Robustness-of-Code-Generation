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
                // Look for specific strings that indicate Java is installed.  We check for OpenJDK as well as Oracle JDK.
                if (line.contains("java version") || line.contains("openjdk version")) {
                    return true;
                }
            }

            // If nothing indicating Java version is found, return false.  This also handles cases where java command doesn't exist at all
            return false;

        } catch (IOException e) {
            // An exception means java command likely isn't executable or accessible, so treat it as not installed
            return false;
        }
    }

    public static void main(String[] args) {
        if (isJavaInstalled()) {
            System.out.println("Java is installed on your system.");
        } else {
            System.out.println("Java is NOT installed on your system.");
        }
    }
}
