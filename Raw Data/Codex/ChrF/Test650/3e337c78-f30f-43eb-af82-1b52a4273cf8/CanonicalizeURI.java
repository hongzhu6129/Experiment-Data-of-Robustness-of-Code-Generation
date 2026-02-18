import java.net.URI;
import java.net.URISyntaxException;

public class CanonicalizeURI {

    public static void main(String[] args) throws URISyntaxException {
        // Test case 1: Simple URI
        String uri1 = "http://www.example.com/index.html";
        System.out.println("Original URI: " + uri1);
        System.out.println("Canonicalized URI: " + canonicalize(uri1));

        // Test case 2: URI with query parameters
        String uri2 = "http://www.example.com/search?q=java";
        System.out.println("\nOriginal URI: " + uri2);
        System.out.println("Canonicalized URI: " + canonicalize(uri2));

        // Test case 3: URI with fragment
        String uri3 = "http://www.example.com/index.html#section-1";
        System.out.println("\nOriginal URI: " + uri3);
        System.out.println("Canonicalized URI: " + canonicalize(uri3));

        // Test case 4: URI with relative path
        String uri4 = "/relative/path/to/file.txt";
        System.out.println("\nOriginal URI: " + uri4);
        System.out.println("Canonicalized URI: " + canonicalize(uri4));

        // Test case 5: URI with empty path
        String uri5 = "http://www.example.com";
        System.out.println("\nOriginal URI: " + uri5);
        System.out.println("Canonicalized URI: " + canonicalize(uri5));

        // Test case 6: URI with trailing slash
        String uri6 = "http://www.example.com/";
        System.out.println("\nOriginal URI: " + uri6);
        System.out.println("Canonicalized URI: " + canonicalize(uri6));

        // Test case 7: URI with multiple slashes
        String uri7 = "http://www.example.com///index.html";
        System.out.println("\nOriginal URI: " + uri7);
        System.out.println("Canonicalized URI: " + canonicalize(uri7));

        // Test case 8: URI with invalid characters
        String uri8 = "http://www.example.com/%20invalid%20characters";
        System.out.println("\nOriginal URI: " + uri8);
        System.out.println("Canonicalized URI: " + canonicalize(uri8));

        // Test case 9: URI with uppercase scheme
        String uri9 = "HTTP://www.example.com/index.html";
        System.out.println("\nOriginal URI: " + uri9);
        System.out.println("Canonicalized URI: " + canonicalize(uri9));

        // Test case 10: Invalid URI
        String invalidUri = "Invalid URI";
        try {
            System.out.println("\nOriginal URI: " + invalidUri);
            System.out.println("Canonicalized URI: " + canonicalize(invalidUri));
        } catch (URISyntaxException e) {
            System.out.println("Error: Invalid URI");
        }
    }

    public static String canonicalize(String uri) throws URISyntaxException {
        URI originalUri = new URI(uri);
        URI canonicalizedUri = originalUri.normalize();
        return canonicalizedUri.toString();
    }
}
