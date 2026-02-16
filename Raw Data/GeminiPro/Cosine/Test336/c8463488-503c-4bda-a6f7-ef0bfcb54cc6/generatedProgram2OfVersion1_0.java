public class AlphabetComposite {

    public static void main(String[] args) {
        long composite = 1;
        for (char c = 'a'; c <= 'z'; c++) {
            composite *= (int) c;
        }

        System.out.println("Composite of all alphabet characters (overflows for full product): " + composite);
    }
}
