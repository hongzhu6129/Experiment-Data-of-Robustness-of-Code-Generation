import java.util.TreeSet;

public class TreeSetLeastElement {

    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some elements to the TreeSet
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        // Check if the TreeSet is empty
        if (numbers.isEmpty()) {
            System.out.println("TreeSet is empty.");
        } else {
            // Get the first element (least element) using first()
            Integer leastElement = numbers.first();
            System.out.println("Least element in the TreeSet: " + leastElement);
        }


        //Example with Strings:
        TreeSet<String> strings = new TreeSet<>();
        strings.add("Zebra");
        strings.add("Apple");
        strings.add("Banana");

        if(strings.isEmpty()){
            System.out.println("String TreeSet is empty.");
        } else {
            String leastString = strings.first();
            System.out.println("Least string in the TreeSet: " + leastString);
        }



    }
}
