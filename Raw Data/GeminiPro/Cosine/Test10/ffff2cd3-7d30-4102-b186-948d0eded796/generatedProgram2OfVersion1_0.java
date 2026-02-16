import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FaceTest {

    public static void main(String[] args) throws IOException {
        String expectedOutput = "  +\"\"\"\"\"+\n [| o o |] \n  |  ^  | \n  | '-' | \n  +-----+";
        String actualOutput = Files.readString(Paths.get("output.txt")); // Assuming output.txt was created by redirecting FacePrinter output

        if (expectedOutput.equals(actualOutput)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
            System.out.println("Expected:\n" + expectedOutput);
            System.out.println("Actual:\n" + actualOutput);
        }
    }
}
