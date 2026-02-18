import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {

    public static String removeDuplicateCharacters(String str) {
        // Create a LinkedHashSet to store unique characters
        LinkedHashSet<Character> uniqueCharacters = new LinkedHashSet<>();

        // Iterate over the input string
        for (char c : str.toCharArray()) {
            // Add the character to the set if it is not already present
            uniqueCharacters.add(c);
        }

        // Convert the set back to a string
        StringBuilder sb = new StringBuilder();
        for (char c : uniqueCharacters) {
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "helloworld";
        System.out.println(removeDuplicateCharacters(str)); // Output: helloworld
        
        str = "mississippi";
        System.out.println(removeDuplicateCharacters(str)); // Output: misp
        
        str = "aabbbccccddddeeeeff";
        System.out.println(removeDuplicateCharacters(str)); // Output: abcdef
        
        str = "";
        System.out.println(removeDuplicateCharacters(str)); // Output: 
        
        str = "aa";
        System.out.println(removeDuplicateCharacters(str)); // Output: a
    }
}
