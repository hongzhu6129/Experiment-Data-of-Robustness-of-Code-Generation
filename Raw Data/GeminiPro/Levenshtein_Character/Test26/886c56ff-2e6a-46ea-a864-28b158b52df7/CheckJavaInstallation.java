import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckJavaInstallation {

    public static boolean isJavaInstalled() {
        try {
            Process process = Runtime.getRuntime().exec("java -version");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream())); // Read from error stream
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("java version") || line.startsWith("openjdk version")) {
                    return true; // Found java or openjdk
                }
            }
            return false; // java -version didn't output expected string
        } catch (IOException e) {
            return false; // Error executing command, likely not installed
        }
    }

    public static void main(String[] args) {
        if (isJavaInstalled()) {
            System.out.println("Java is installed.");
        } else {
            System.out.println("Java is not installed.");
        }
    }
}


