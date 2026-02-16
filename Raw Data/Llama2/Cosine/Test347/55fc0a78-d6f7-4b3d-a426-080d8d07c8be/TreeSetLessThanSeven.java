import java.util.TreeSet;

public class TreeSetLessThanSeven {

    public static void main(String[] args) {

        // Create a TreeSet of Integer objects
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some numbers to the TreeSet (order is maintained automatically)
        numbers.add(9);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(12);
        numbers.add(3);

        System.out.println("Original TreeSet: " + numbers);

        // Method 1: Using headSet()  (most efficient for TreeSets)
        System.out.println("Numbers less than 7 (using headSet): " + numbers.headSet(7));


        // Method 2: Enhanced for loop with conditional check
        System.out.print("Numbers less than 7 (using loop): ");
        for (int num : numbers) {
            if (num < 7) {
                System.out.print(num + " ");
            }
        }
        System.out.println();


        // Method 3: Java Streams API (for more complex filtering scenarios)
        System.out.print("Numbers less than 7 (using streams): ");
        numbers.stream()
               .filter(num -> num < 7)
               .forEach(num -> System.out.print(num + " "));
        System.out.println();



        // Example using a custom object with a Comparator (important for non-primitive types)

        TreeSet<MyObject> customObjects = new TreeSet<>((o1, o2) -> Integer.compare(o1.value, o2.value)); // Comparator for sorting

        customObjects.add(new MyObject(8));
        customObjects.add(new MyObject(3));
        customObjects.add(new MyObject(6));
        customObjects.add(new MyObject(1));

        System.out.print("Custom Objects with value less than 7 (using headSet): ");
        for(MyObject obj : customObjects.headSet(new MyObject(7))) {
            System.out.print(obj.value + " ");
        }


    }

    // Example custom object (for demonstration of Comparator with TreeSet)
    static class MyObject {
        int value;

        public MyObject(int value) {
            this.value = value;
        }
    }
}
