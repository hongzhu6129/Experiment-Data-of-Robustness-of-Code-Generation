import java.util.TreeMap;

public class TreeMapSearch {

    public static void main(String[] args) {

        // Create a TreeMap to store key-value pairs.
        // TreeMap automatically sorts entries based on the natural ordering of keys
        // (or a provided Comparator).
        TreeMap<String, Integer> studentScores = new TreeMap<>();

        // Add some sample data
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 95);
        studentScores.put("David", 78);
        studentScores.put("Eve", 88);


        // 1. containsKey() method:  Checks if a key exists in the TreeMap.

        String keyToSearch = "Bob"; 

        if (studentScores.containsKey(keyToSearch)) {
            System.out.println(keyToSearch + " is found in the TreeMap.");
        } else {
            System.out.println(keyToSearch + " is NOT found in the TreeMap.");
        }


        // 2. get() method: Retrieves the value associated with a key.
        // Returns null if the key is not found.  This is the more common
        // and generally preferred way to search, as you often want the value.

        keyToSearch = "Charlie";
        Integer score = studentScores.get(keyToSearch);

        if (score != null) {
            System.out.println("Score of " + keyToSearch + ": " + score);
        } else {
            System.out.println(keyToSearch + " is NOT found in the TreeMap.");
        }



        // 3. Searching within a range (demonstrates TreeMap's ordered nature)
        // Find all students with scores between 80 and 90 (inclusive).

        System.out.println("\nStudents with scores between 80 and 90:");
        // subMap() gives a portion of the map based on key ranges.
        // headMap() and tailMap() also useful to get parts of the ordered map.
        TreeMap<String, Integer> rangeOfScores = new TreeMap<>(studentScores.subMap("A", true,  "Z", true ));//all students
         for(String n: rangeOfScores.keySet()){
             Integer sc = rangeOfScores.get(n);
             if(sc >= 80 && sc <=90)
                 System.out.println(n + ": " + sc);


         }
    }
}
