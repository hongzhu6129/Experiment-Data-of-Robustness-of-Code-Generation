import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMinMax {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 5, 6);

        // Find the maximum value
        Optional<Integer> max = numbers.stream().max(Comparator.naturalOrder());
        max.ifPresent(value -> System.out.println("Maximum: " + value));

        // Find the minimum value
        Optional<Integer> min = numbers.stream().min(Comparator.naturalOrder());
        min.ifPresent(value -> System.out.println("Minimum: " + value));


        //Alternative shorter way (Java 8+):
        System.out.println("----Alternative Way----");
        numbers.stream().mapToInt(Integer::intValue).summaryStatistics().ifPresent(stats -> {
            System.out.println("Maximum: " + stats.getMax());
            System.out.println("Minimum: " + stats.getMin());
            //You can also get other stats like average, count, sum etc. easily with this approach.
        });



        // Handling empty lists: Demonstrates better practice to avoid exceptions if the list might be empty.
        System.out.println("----Handling Empty List----");
        List<Integer> emptyList = Arrays.asList();

        Integer maxEmpty = emptyList.stream().max(Comparator.naturalOrder()).orElse(null); // Or provide a default value
        Integer minEmpty = emptyList.stream().min(Comparator.naturalOrder()).orElse(null);


        System.out.println("Max of empty list: " + (maxEmpty != null ? maxEmpty : "List is empty"));
        System.out.println("Min of empty list: " + (minEmpty != null ? minEmpty : "List is empty"));


    }
}
