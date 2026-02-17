import java.util.ArrayList;
import java.util.List;

public class Buffer {
    private List<Integer> data;
    private int capacity;

    public Buffer(int capacity) {
        this.data = new ArrayList<>();
        this.capacity = capacity;
    }

    public synchronized void put(int item) throws InterruptedException {
        // Wait until there's space in the buffer
        while (data.size() == capacity) {
            wait();
        }

        // Add the item to the buffer
        data.add(item);

        // Notify waiting threads that data is available
        notifyAll();
    }

    public synchronized int get() throws InterruptedException {
        // Wait until there's data in the buffer
        while (data.isEmpty()) {
            wait();
        }

        // Remove the first item from the buffer
        int item = data.remove(0);

        // Notify waiting threads that space is available in the buffer
        notifyAll();

        return item;
    }
}
