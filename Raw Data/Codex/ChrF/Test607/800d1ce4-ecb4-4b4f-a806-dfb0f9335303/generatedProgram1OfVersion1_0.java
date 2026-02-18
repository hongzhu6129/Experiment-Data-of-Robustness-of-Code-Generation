import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckJavaInstallation {

    public static boolean isJavaInstalled() {
        try {
            Process process = Runtime.getRuntime().exec("java -version");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream())); // Java version info goes to error stream
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("java version") || line.startsWith("openjdk version")) {  //Handles OpenJDK too
                    return true;
                }
            }
            return false; // Didn't find java version in output
        } catch (IOException e) {
            return false; //  Likely means java isn't accessible in the environment
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
