public class MutexCounter implements Counter {

    private long value = COUNT;

    @Override
    public synchronized void increment() {
        value++;
        System.out.println("value is " + value);
    }

    @Override
    public synchronized long getValue() {
        return value;
    }
}
