import java.util.PriorityQueue;

public class InsertIntoPriorityQueue {

    public static void main(String[] args) {
        // Create a PriorityQueue of Integers (you can change the type as needed)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Insert elements into the PriorityQueue
        pq.offer(5);
        pq.offer(2);
        pq.offer(8);
        pq.offer(1);
        pq.offer(10);

        // Element to insert
        int elementToInsert = 7;

        // Insert the element (offer() automatically handles prioritization)
        pq.offer(elementToInsert);


        // Print the PriorityQueue (elements will be in natural order - smallest to largest for Integers)
        System.out.println("PriorityQueue after insertion: " + pq);


        // Example with a String PriorityQueue
        PriorityQueue<String> stringPQ = new PriorityQueue<>();
        stringPQ.offer("banana");
        stringPQ.offer("apple");
        stringPQ.offer("orange");

        stringPQ.offer("grape"); // Insert "grape"

        System.out.println("String PriorityQueue after insertion: " + stringPQ);


        // Example with custom comparator (for example, to store objects and prioritize based on a specific field)
        // Requires defining a Comparator class/lambda as shown below
         PriorityQueue<Person> personPQ = new PriorityQueue<>((p1, p2) -> Integer.compare(p1.age, p2.age));  // Prioritize based on age (youngest first)


        personPQ.offer(new Person("Alice", 30));
        personPQ.offer(new Person("Bob", 25));
        personPQ.offer(new Person("Charlie", 35));


        personPQ.offer(new Person("David", 22)); // Insert "David"

        System.out.println("Person PriorityQueue after insertion: " + personPQ);

    }


    // Example custom class for Priority Queue
    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + "(" + age + ")";
        }


    }

}




