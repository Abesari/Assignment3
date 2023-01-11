package Assignment3;

class Producer implements Runnable {
    private BoundedBuffer buffer;
    private int value;

    public Producer(BoundedBuffer buffer, int value) {
        this.buffer = buffer;
        this.value = value;
    }

    public void run() {
        try {
            buffer.produce(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
