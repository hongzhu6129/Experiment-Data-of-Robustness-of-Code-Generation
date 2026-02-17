import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleList {

    public static void main(String[] args) {

        // Create a sophisticated list (ArrayList in this case)
        List<Object> sophisticatedList = new ArrayList<>();

        // Populate the list with diverse elements
        sophisticatedList.add("String element");
        sophisticatedList.add(123); // Integer
        sophisticatedList.add(45.67); // Double
        sophisticatedList.add(new Character('A')); // Character
        sophisticatedList.add(true); // Boolean
        sophisticatedList.add(new int[]{1, 2, 3}); // Array


        // Shuffle the list using Collections.shuffle()
        Collections.shuffle(sophisticatedList);

        // Print the shuffled list
        System.out.println("Shuffled List: " + sophisticatedList);


        // Example with a custom object
        class Person {
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


        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));


        Collections.shuffle(people); // Shuffle the list of Person objects

        System.out.println("Shuffled People: " + people);

    }
}
