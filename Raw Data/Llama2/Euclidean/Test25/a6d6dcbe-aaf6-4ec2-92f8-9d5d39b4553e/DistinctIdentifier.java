import java.util.UUID;

public class DistinctIdentifier {

    public static void main(String[] args) {
        // Create a distinct identifier using UUID
        String identifier = UUID.randomUUID().toString();

        // Print the identifier
        System.out.println("Identifier: " + identifier);
    }
}
