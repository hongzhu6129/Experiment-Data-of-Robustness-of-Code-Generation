import java.util.TreeSet;

public class TreeSetFloorExample {

    public static void main(String[] args) {

        // Create a TreeSet of Integer
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Example 1: Element present in the TreeSet
        int element1 = 30;
        Integer floor1 = numbers.floor(element1);
        System.out.println("Floor of " + element1 + ": " + floor1); // Output: 30


        // Example 2: Element not present, but a smaller element exists
        int element2 = 35;
        Integer floor2 = numbers.floor(element2);
        System.out.println("Floor of " + element2 + ": " + floor2); // Output: 30

        // Example 3: Element smaller than all elements in the TreeSet
        int element3 = 5;
        Integer floor3 = numbers.floor(element3);
        System.out.println("Floor of " + element3 + ": " + floor3); // Output: null (no smaller element)

        // Example 4: Using a different data type (String)
        TreeSet<String> names = new TreeSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        String name = "Cindy";
        String floorName = names.floor(name);
        System.out.println("Floor of " + name + ": " + floorName); // Output: Bob


         //Example 5: Illustrating the difference between floor and lower
         TreeSet<Integer> numbers2 = new TreeSet<>();
        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(30);

        int element5 = 20; // Element is present
        Integer floorValue = numbers2.floor(element5);  // Greatest element <= 20
        Integer lowerValue = numbers2.lower(element5);   // Greatest element < 20

        System.out.println("Floor of " + element5 + ": " + floorValue); // Output: 20
        System.out.println("Lower of " + element5 + ": " + lowerValue); // Output: 10

    }
}
