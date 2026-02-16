import java.util.Comparator;
import java.util.TreeMap;

public class SortLocksTreeMap {

    public static void main(String[] args) {
        // Create a TreeMap with a custom Comparator
        TreeMap<String, String> locks = new TreeMap<>(new LockComparator());

        // Add some locks (key is lock name, value could be any lock-related data)
        locks.put("Lock C", "Some data for Lock C");
        locks.put("Lock A", "Some data for Lock A");
        locks.put("Lock B", "Some data for Lock B");
        locks.put("Lock D", "Some data for Lock D");


        // Print the sorted locks
        System.out.println("Sorted Locks:");
        for (String lockName : locks.keySet()) {
            System.out.println(lockName + ": " + locks.get(lockName));
        }
    }


    public int compare(String lock1, String lock2) { 
        // Custom comparison logic (case-insensitive sorting)
        return lock1.compareToIgnoreCase(lock2); 
    }


    // Inner class implementing Comparator for String comparison
    // This is a workaround since we can't directly use the 'compare' method
    // with the main method signature restriction as it can't be static.
    private static class LockComparator implements Comparator<String> {
        @Override
        public int compare(String lock1, String lock2) {
            // Delegate the comparison to the outer class's compare method.
            return new SortLocksTreeMap().compare(lock1,lock2);

        }
    }
}
