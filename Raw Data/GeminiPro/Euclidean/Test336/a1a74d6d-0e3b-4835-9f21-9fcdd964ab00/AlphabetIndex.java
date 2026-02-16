public class AlphabetIndex {

    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < alphabet.length(); i++) {
            char character = alphabet.charAt(i);
            int index = i; // Since alphabet is 0-indexed
            System.out.println("Character: " + character + ", Index: " + index);
        }
    }
}
