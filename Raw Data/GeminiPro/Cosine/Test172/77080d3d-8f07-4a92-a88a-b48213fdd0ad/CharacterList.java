import java.util.List;
import java.util.Arrays;

public class CharacterList {

    public static void main(String[] args) {
        String word = "Hello";
        List<Character> characters = getCharacters(word);
        System.out.println(characters);
    }

    public static List<Character> getCharacters(String word) {
        Character[] chars = new Character[word.length()];
        for (int i = 0; i < word.length(); i++) {
            chars[i] = word.charAt(i);
        }
        return Arrays.asList(chars);
    }
}
