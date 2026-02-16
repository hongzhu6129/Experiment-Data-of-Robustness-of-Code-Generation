import java.util.List;
import java.util.Arrays;

public class FluteCounter {

    public static void main(String[] args) {
        List<String> flutes = Arrays.asList("FluteA", "FluteB", "Piccolo", "FluteC", "Oboe", "FluteD", "fluteE");

        char startingLetter = 'F'; // Specify the starting letter

        long count = flutes.stream()
                .filter(flute -> flute.startsWith(String.valueOf(startingLetter)))
                .count();

        System.out.println("Number of flutes starting with '" + startingLetter + "': " + count);


        // Example with lowercase 'f' - Demonstrates case-sensitivity
        startingLetter = 'f'; 
        count = flutes.stream()
                .filter(flute -> flute.startsWith(String.valueOf(startingLetter)))
                .count();

        System.out.println("Number of flutes starting with '" + startingLetter + "': " + count);


        // Example ignoring case
        startingLetter = 'f';
        count = flutes.stream()
                .filter(flute -> flute.toLowerCase().startsWith(String.valueOf(startingLetter)))
                .count();
        System.out.println("Number of flutes starting with '" + startingLetter + "' (case-insensitive): " + count);

    }
}
