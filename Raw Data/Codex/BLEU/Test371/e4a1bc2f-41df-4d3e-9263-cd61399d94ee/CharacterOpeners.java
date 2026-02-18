import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOpeners {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        Map<Character, Character> openerMap = new HashMap<>();
        openerMap.put('(', ')');
        openerMap.put('{', '}');
        openerMap.put('[', ']');

        StringBuilder outputString = new StringBuilder();
        for (char character : inputString.toCharArray()) {
            if (openerMap.containsKey(character)) {
                outputString.append(character);
            } else if (openerMap.containsValue(character)) {
                outputString.append(getOpener(openerMap, character));
            }
        }

        System.out.println("The string with all openers and closers: " + outputString);
    }

    public static char getOpener(Map<Character, Character> openerMap, char closer) {
        for (Map.Entry<Character, Character> entry : openerMap.entrySet()) {
            if (entry.getValue() == closer) {
                return entry.getKey();
            }
        }
        return ' ';
    }
}
