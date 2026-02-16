import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FluteSorter {

    public static void main(String[] args) {
        List<String> flutes = Arrays.asList("C Flute", "Alto Flute", "Bass Flute", "Piccolo", "Contra-alto Flute");

        // Ascending order
        List<String> ascendingSortedFlutes = flutes.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Ascending Order:");
        ascendingSortedFlutes.forEach(System.out::println);


        // Descending order
        List<String> descendingSortedFlutes = flutes.stream()
                .sorted((flute1, flute2) -> flute2.compareTo(flute1)) // Use a comparator for descending
                .collect(Collectors.toList());

        System.out.println("\nDescending Order:");
        descendingSortedFlutes.forEach(System.out::println);

         // Using Comparator.reverseOrder() for descending (more concise) - Java 8+
        List<String> descendingSortedFlutes2 = flutes.stream()
                .sorted(String::compareTo).reversed() // or Comparator.reverseOrder()
                .collect(Collectors.toList());

         System.out.println("\nDescending Order (using reversed):"); 
        descendingSortedFlutes2.forEach(System.out::println);


    }
}
