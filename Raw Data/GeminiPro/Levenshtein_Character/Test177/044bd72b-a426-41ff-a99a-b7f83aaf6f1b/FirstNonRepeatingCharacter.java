import java.util.*;

public class FirstNonRepeatingCharacter {

    private Queue<Character> queue = new LinkedList<>();
    private Set<Character> repeated = new HashSet<>();

    public void read(char ch) {
        queue.offer(ch);
        repeated.add(ch);
        while (!queue.isEmpty() && repeated.contains(queue.peek())) {
            queue.poll();
        }
    }

    public char firstNonRepeating() {
        return queue.isEmpty() ? Character.MIN_VALUE : queue.peek();
    }

    public static void main(String[] args) {
        FirstNonRepeatingCharacter fnrc = new FirstNonRepeatingCharacter();
        fnrc.read('a');
        System.out.println(fnrc.firstNonRepeating());  // a
        fnrc.read('a');
        System.out.println(fnrc.firstNonRepeating());  // Character.MIN_VALUE
        fnrc.read('b');
        System.out.println(fnrc.firstNonRepeating());  // b
        fnrc.read('a');
        System.out.println(fnrc.firstNonRepeating());  // Character.MIN_VALUE
        fnrc.read('c');
        System.out.println(fnrc.firstNonRepeating());  // c
    }
}
