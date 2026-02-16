import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {

    public static void main(String[] args) {
        // Create a HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grape");

        // Convert HashSet to TreeSet (natural ordering)
        Set<String> treeSet = new TreeSet<>(hashSet);

        // Print the TreeSet (elements will be sorted)
        System.out.println("TreeSet: " + treeSet);


        // Example with Integer objects (demonstrates natural ordering)
        Set<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(5);
        integerHashSet.add(2);
        integerHashSet.add(8);
        integerHashSet.add(1);

        Set<Integer> integerTreeSet = new TreeSet<>(integerHashSet);
        System.out.println("Integer TreeSet: " + integerTreeSet);


        //Example with custom objects and a Comparator (if needed for specific ordering):
        //  See below for a full example with a custom Comparator.


    }
}
/* Example with a custom Comparator (for custom objects):

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Person {  // Example custom class
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class HashSetToTreeSet {

    public static void main(String[] args) {

        Set<Person> personHashSet = new HashSet<>();
        personHashSet.add(new Person("Alice", 30));
        personHashSet.add(new Person("Bob", 25));
        personHashSet.add(new Person("Charlie", 35));

        // Create a Comparator to sort Person objects by age
        Comparator<Person> ageComparator = Comparator.comparingInt(p -> p.age);

        // Create a TreeSet with the custom Comparator
        Set<Person> personTreeSet = new TreeSet<>(ageComparator);
        personTreeSet.addAll(personHashSet); // Add elements from the HashSet

        System.out.println("Person TreeSet (sorted by age): " + personTreeSet);


    }
}
*/
