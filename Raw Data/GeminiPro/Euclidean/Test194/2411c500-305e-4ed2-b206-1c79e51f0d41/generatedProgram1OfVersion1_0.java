import java.util.Arrays;
import java.util.Comparator;

public class CompareChords {

    public static void main(String[] args) {
        // Create three chords
        Chord chord1 = new Chord("C", "E", "G");
        Chord chord2 = new Chord("C", "E", "G#");
        Chord chord3 = new Chord("C", "F", "G");

        // Compare the chords lexicographically, ignoring case differences
        Comparator<Chord> comparator = Comparator.comparing(Chord::toString, String.CASE_INSENSITIVE_ORDER);
        int result = comparator.compare(chord1, chord2);

        // Print the result
        if (result < 0) {
            System.out.println("Chord 1 is less than Chord 2");
        } else if (result > 0) {
            System.out.println("Chord 1 is greater than Chord 2");
        } else {
            System.out.println("Chord 1 is equal to Chord 2");
        }

        // Test cases
        Chord[] chords = {
                new Chord("C", "E", "G"),
                new Chord("C", "E", "G#"),
                new Chord("C", "F", "G"),
                new Chord("C#", "E", "G"),
                new Chord("C", "Eb", "G"),
                new Chord("C", "E", "Gb"),
                new Chord("C", "E", "G##"),
                new Chord("C", "E", "Fb")
        };

        // Sort the chords lexicographically, ignoring case differences
        Arrays.sort(chords, comparator);

        // Print the sorted chords
        for (Chord chord : chords) {
            System.out.println(chord);
        }
    }

    private static class Chord {

        private String root;
        private String third;
        private String fifth;

        public Chord(String root, String third, String fifth) {
            this.root = root;
            this.third = third;
            this.fifth = fifth;
        }

        @Override
        public String toString() {
            return root + third + fifth;
        }
    }
}
