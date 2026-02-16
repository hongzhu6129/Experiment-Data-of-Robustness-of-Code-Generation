public class GetCharacterAtIndex {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java GetCharacterAtIndex <string> <index>");
            return;
        }

        String inputString = args[0];
        int index;

        try {
            index = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid index. Please provide an integer.");
            return;
        }


        if (index < 0 || index >= inputString.length()) {
            System.out.println("Index out of bounds.");
        } else {
            int codePoint = inputString.codePointAt(index);
            System.out.println("Character at index " + index + ": " + (char) codePoint + " (Unicode code point: " + codePoint + ")");
        }


    }
}
