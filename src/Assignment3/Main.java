package Assignment3;

public class Main {
    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer(3);

        Thread producerThread = new Thread(new Producer(buffer, 1));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}

