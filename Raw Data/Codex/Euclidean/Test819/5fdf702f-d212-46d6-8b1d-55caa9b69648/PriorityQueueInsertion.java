import java.util.PriorityQueue;

public class PriorityQueueInsertion {

    public static void main(String[] args) {
        // Create a PriorityQueue of Integers (you can change the type as needed)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add some initial elements (optional)
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);

        // Element to insert
        int elementToInsert = 6;

        // Insert the element
        pq.add(elementToInsert);


        // Print the PriorityQueue (elements will be ordered according to natural ordering or a Comparator if provided)
        System.out.println("PriorityQueue after insertion: " + pq);


        // Example with Strings (natural ordering - alphabetical)
        PriorityQueue<String> stringPQ = new PriorityQueue<>();
        stringPQ.add("banana");
        stringPQ.add("apple");
        stringPQ.add("orange");

        stringPQ.add("grape"); // Inserting "grape"

        System.out.println("String PriorityQueue: " + stringPQ);


        // Example with custom objects and Comparator (example with a Person class)
        class Person implements Comparable<Person> {  // Must be Comparable
            String name;
            int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public int compareTo(Person other) { // Sort by age (ascending)
                return this.age - other.age;
            }

            @Override
            public String toString() {
                return name + "(" + age + ")";
            }
        }



        PriorityQueue<Person> personPQ = new PriorityQueue<>();

        personPQ.add(new Person("Alice", 30));
        personPQ.add(new Person("Bob", 25));
        personPQ.add(new Person("Charlie", 35));

        personPQ.add(new Person("David", 28)); // Inserting "David"

        System.out.println("Person PriorityQueue: " + personPQ);





    }
}
