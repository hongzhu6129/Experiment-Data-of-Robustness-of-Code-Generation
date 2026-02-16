import java.util.Collections;
import java.util.PriorityQueue;

public class MaxPriorityQueue {

    public static void main(String[] args) {
        // Method 1: Using Collections.reverseOrder() comparator
        PriorityQueue<Integer> maxPQ1 = new PriorityQueue<>(Collections.reverseOrder());

        maxPQ1.add(10);
        maxPQ1.add(5);
        maxPQ1.add(20);
        maxPQ1.add(15);

        System.out.println("Max PriorityQueue using Collections.reverseOrder():");
        while (!maxPQ1.isEmpty()) {
            System.out.print(maxPQ1.poll() + " "); // Output: 20 15 10 5
        }
        System.out.println();


        // Method 2: Using a lambda expression for the comparator (Java 8+)
        PriorityQueue<Integer> maxPQ2 = new PriorityQueue<>((a, b) -> b - a); // Reverse order comparator

        maxPQ2.add(10);
        maxPQ2.add(5);
        maxPQ2.add(20);
        maxPQ2.add(15);


        System.out.println("Max PriorityQueue using lambda expression:");
        while (!maxPQ2.isEmpty()) {
            System.out.print(maxPQ2.poll() + " "); // Output: 20 15 10 5 
        }
        System.out.println();


        //Example with custom objects (e.g., Person class with age) - using lambda
        PriorityQueue<Person> maxPQ3 = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()));

        maxPQ3.add(new Person("Alice", 30));
        maxPQ3.add(new Person("Bob", 25));
        maxPQ3.add(new Person("Charlie", 35));


        System.out.println("Max PriorityQueue with custom objects (Person):");
        while (!maxPQ3.isEmpty()) {
            System.out.print(maxPQ3.poll() + " "); // Output: Charlie (35) Alice (30) Bob (25)
        }
        System.out.println();


    }
}

class Person {  // Example custom class
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

