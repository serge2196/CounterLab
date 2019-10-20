import java.util.concurrent.locks.ReentrantLock;

public class LockCounter implements Counter {

    private long value = COUNT;
    private ReentrantLock reentrantLock;

    public LockCounter() {
        reentrantLock = new ReentrantLock();
    }

    @Override
    public void increment() {
        reentrantLock.lock();
        try {
            value++;
            System.out.println("value is " + value);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public long getValue() {
        return value;
    }
}
