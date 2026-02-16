import java.util.ArrayList;
import java.util.List;

public class JoinArrayLists {

    public static void main(String[] args) {

        // Method 1: Using addAll()
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        List<String> list2 = new ArrayList<>();
        list2.add("Grape");
        list2.add("Mango");

        List<String> joinedList1 = new ArrayList<>(list1); // Create a copy to avoid modifying the original list1
        joinedList1.addAll(list2);


        System.out.println("Joined list using addAll(): " + joinedList1);



        // Method 2:  Iterating and adding
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(4);
        numbers2.add(5);

        List<Integer> joinedList2 = new ArrayList<>();

        for (Integer num : numbers1) {
            joinedList2.add(num);
        }
        for (Integer num : numbers2) {
            joinedList2.add(num);
        }

        System.out.println("Joined list using iteration: " + joinedList2);



         //Method 3: Using Java Streams (Java 8 and above) - more advanced
        List<Double> doubles1 = new ArrayList<>();
        doubles1.add(1.1);
        doubles1.add(2.2);


        List<Double> doubles2 = new ArrayList<>();
        doubles2.add(3.3);
        doubles2.add(4.4);

        List<Double> joinedList3 = new ArrayList<>(); // For mutable result
        joinedList3.addAll(doubles1);
        joinedList3.addAll(doubles2);
                
        System.out.println("Joined list using addAll - for streams demo: " + joinedList3);


        // Explanation of Streams (though we can't directly use it in a simplified main method)
        // If you were outside of the main method restriction and using Java 8+, streams would provide a concise way:
        // List<Double> joinedListStreams = Stream.concat(doubles1.stream(), doubles2.stream()).collect(Collectors.toList());


    }
}
