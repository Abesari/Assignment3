package Assignment3;

import java.util.LinkedList;
import java.util.Queue;

public class BoundedBuffer {
    private Queue<Integer> queue;
    private int maxSize;

    public BoundedBuffer(int maxSize) {
        this.queue = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public void produce(int value) throws InterruptedException {
        while (queue.size() == maxSize) {
            wait();
        }
        queue.add(value);
        notify();
    }

    public int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        int value = queue.remove();
        notify();
        return value;
    }
}
