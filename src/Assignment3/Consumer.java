package Assignment3;

class Consumer implements Runnable {
    private BoundedBuffer buffer;

    public Consumer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            int value = buffer.consume();
            System.out.println("Consumed: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
