import java.util.Comparator;
import java.util.TreeMap;

public class SortLocksTreeMap {

    public static void main(String[] args) {
        // Create a TreeMap with a custom comparator
        TreeMap<String, String> locks = new TreeMap<>(new LockComparator());

        // Add some locks (key is lock name, value could be any associated data)
        locks.put("Lock C", "Description C");
        locks.put("Lock A", "Description A");
        locks.put("Lock B", "Description B");
        locks.put("Lock D", "Description D");


        // Print the sorted locks
        System.out.println("Sorted Locks:");
        for (String lockName : locks.keySet()) {
            System.out.println(lockName + ": " + locks.get(lockName));
        }
    }

    public static class LockComparator implements Comparator<String> {
        @Override
        public int compare(String lock1, String lock2) {
            // Perform comparison logic here (e.g., alphabetical order)
            return lock1.compareTo(lock2); // Example: Sort alphabetically
            //return lock2.compareTo(lock1); //Reverse Alphabetical Order
            // For more complex sorting, implement your custom logic here
        }
    }
}

