import java.util.HashMap;
import java.util.Map;

public class AlphabetIndex {

    public static void main(String[] args) {
        // Create a map to store the index of each character
        Map<Character, Integer> alphabetIndex = new HashMap<>();
        
        // Populate the map with the index of each character
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetIndex.put(c, c - 'a');
        }

        // Get the index of a character
        char c = 'c';
        int index = alphabetIndex.get(c);
        System.out.println("The index of " + c + " is: " + index);
        
        //Test Cases
        //Edge Case: Returns -1 if character is not found
        char notFound = '#';
        if (alphabetIndex.containsKey(notFound)) {
            index = alphabetIndex.get(notFound);
        } else {
            index = -1;
        }
        System.out.println("The index of " + notFound + " is: " + index);

        //Edge Case: Returns index of uppercase character
        char upperCase = 'C';
        if (alphabetIndex.containsKey(upperCase)) {
            index = alphabetIndex.get(upperCase);
        } else {
            index = -1;
        }
        System.out.println("The index of " + upperCase + " is: " + index);

    }
}
