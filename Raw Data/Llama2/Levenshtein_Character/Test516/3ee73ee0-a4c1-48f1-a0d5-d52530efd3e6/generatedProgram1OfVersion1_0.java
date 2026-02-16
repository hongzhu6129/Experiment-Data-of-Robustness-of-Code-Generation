import java.util.HashSet;

public class HashSetClone {

    public static void main(String[] args) {

        // Create a HashSet of strings
        HashSet<String> originalSet = new HashSet<>();
        originalSet.add("apple");
        originalSet.add("banana");
        originalSet.add("orange");

        // Method 1: Using the constructor
        HashSet<String> clonedSet1 = new HashSet<>(originalSet);

        // Method 2: Using the clone() method (less preferred due to type casting)
        HashSet<String> clonedSet2 = (HashSet<String>) originalSet.clone(); // Cast is required

        // Method 3: Using addAll() method
        HashSet<String> clonedSet3 = new HashSet<>();
        clonedSet3.addAll(originalSet);


        // Print the original and cloned sets
        System.out.println("Original HashSet: " + originalSet);
        System.out.println("Cloned HashSet (Constructor): " + clonedSet1);
        System.out.println("Cloned HashSet (clone() method): " + clonedSet2);
        System.out.println("Cloned HashSet (addAll() method): " + clonedSet3);


        // Demonstrate that modifications to the cloned set do not affect the original set
        clonedSet1.remove("banana");
        System.out.println("\nAfter removing 'banana' from clonedSet1:");
        System.out.println("Original HashSet: " + originalSet);
        System.out.println("Cloned HashSet (Constructor): " + clonedSet1);


        // Demonstrate cloning a HashSet of custom objects
        HashSet<MyObject> objectSet = new HashSet<>();
        objectSet.add(new MyObject("Object 1"));
        objectSet.add(new MyObject("Object 2"));

        HashSet<MyObject> clonedObjectSet = new HashSet<>(objectSet); // Preferred method

        System.out.println("\nOriginal Object HashSet: " + objectSet);
        System.out.println("Cloned Object HashSet: " + clonedObjectSet);


    }

    // Example custom object class (for demonstration purposes)
    static class MyObject {
        String name;

        public MyObject(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }

        @Override
        public int hashCode() { // Essential for correct HashSet behavior with custom objects
            return name.hashCode();
        }

        @Override
        public boolean equals(Object obj) { // Essential for correct HashSet behavior with custom objects
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            MyObject other = (MyObject) obj;
            return name.equals(other.name); 
        }

    }
}
