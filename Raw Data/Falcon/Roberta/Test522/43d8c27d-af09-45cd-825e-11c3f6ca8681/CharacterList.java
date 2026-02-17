import java.util.List;
import java.util.Arrays;

public class CharacterList {

    public static void main(String[] args) {
        String word = "Hello";
        List<Character> characters = Arrays.asList(word.toCharArray());
        System.out.println(characters);
    }
}
