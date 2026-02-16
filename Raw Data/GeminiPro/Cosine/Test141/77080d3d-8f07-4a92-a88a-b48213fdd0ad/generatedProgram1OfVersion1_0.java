import java.util.ArrayList;
import java.util.List;

public class CharactersOfWord {

    public static List<Character> getCharactersOfWord(String word) {
        List<Character> characters = new ArrayList<>();

        for (char c : word.toCharArray()) {
            characters.add(c);
        }

        return characters;
    }

    public static void main(String[] args) {
        String word = "HelloWorld";
        List<Character> characters = getCharactersOfWord(word);

        System.out.println("Characters of the word '" + word + "': ");
        for (Character character : characters) {
            System.out.println(character);
        }
    }
}
