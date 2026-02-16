import java.util.Collections;
import java.util.PriorityQueue;

public class MaxPriorityQueue {

    public static void main(String[] args) {
        // Method 1: Using Collections.reverseOrder() comparator

        PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        maxPriorityQueue.add(10);
        maxPriorityQueue.add(5);
        maxPriorityQueue.add(20);
        maxPriorityQueue.add(15);

        System.out.println("Max PriorityQueue (using Collections.reverseOrder()):");
        while (!maxPriorityQueue.isEmpty()) {
            System.out.print(maxPriorityQueue.poll() + " "); 
        }
        System.out.println();


        // Method 2: Multiplying by -1 (for numeric types)  - Less efficient but demonstrates an alternative

        PriorityQueue<Integer> maxPriorityQueue2 = new PriorityQueue<>((a, b) -> b - a); // Lambda comparator

        maxPriorityQueue2.add(10);
        maxPriorityQueue2.add(5);
        maxPriorityQueue2.add(20);
        maxPriorityQueue2.add(15);


        System.out.println("Max PriorityQueue (using lambda comparator):");
        while (!maxPriorityQueue2.isEmpty()) {
            System.out.print(maxPriorityQueue2.poll() + " ");
        }
        System.out.println();



         //Example with custom objects (using Comparator):

        PriorityQueue<Person> personPriorityQueue = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()) // Max heap based on age
        );

        personPriorityQueue.add(new Person("Alice", 30));
        personPriorityQueue.add(new Person("Bob", 25));
        personPriorityQueue.add(new Person("Charlie", 35));


        System.out.println("Max PriorityQueue (with custom objects):");
        while (!personPriorityQueue.isEmpty()) {
            System.out.println(personPriorityQueue.poll());
        }


    }
}

class Person {
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
